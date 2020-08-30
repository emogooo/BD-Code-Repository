using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace HavaGorevOlusturucusu
{
    public partial class Form1 : Form
    {
        List<Gorev> gorev = new List<Gorev>();
        Random uret = new Random();
        int[] karaGorevleri;
        int[] havaGorevleri;
        int[] tumGorevler;
        int karaGorevSayisi;
        int havaGorevSayisi;
        public Form1()
        {
            InitializeComponent();
        }

        private void btnOlustur_Click(object sender, EventArgs e)
        {

            liste.Items.Clear();
            lblAciklama.Text = "";
            karaGorevSayisi = 0;
            havaGorevSayisi = 0;
            try
            {
                karaGorevSayisi = Convert.ToInt32(tbKara.Text);
                havaGorevSayisi = Convert.ToInt32(tbHava.Text);
                tumGorevler = new int[havaGorevSayisi + karaGorevSayisi];
            }
            catch (Exception)
            {
                MessageBox.Show("Bir dahaki sefere düzgün değer gir.");
                return;
            }
            if (karaGorevSayisi < 0 || karaGorevSayisi > 16 || havaGorevSayisi < 0 || havaGorevSayisi > 8)
            {
                MessageBox.Show("Toplam 16 kara ve 8 hava görevi vardır. Lütfen geçerli bir sayı giriniz.");
                return;
            }
            else
            {
                if (karaGorevSayisi != 0)
                {
                    karaGorevleri = new int[karaGorevSayisi];
                    for (int i = 0; i < karaGorevSayisi; i++)
                    {
                        karaGorevleri[i] = -1;
                    }

                    for (int i = 0; i < karaGorevSayisi; i++)
                    {
                        karaGorevleri[i] = uret.Next(0, 16);

                        for (int j = 0; j < karaGorevSayisi; j++)
                        {
                            if (i == j)
                            {
                                continue;
                            }
                            while (karaGorevleri[i] == karaGorevleri[j])
                            {
                                karaGorevleri[i] = uret.Next(0, 16);
                                j = 0;
                            }
                        }
                    }

                    for (int i = 0; i < karaGorevSayisi; i++)
                    {
                        tumGorevler[i] = karaGorevleri[i];
                    }

                }

                if (havaGorevSayisi != 0)
                {

                    havaGorevleri = new int[havaGorevSayisi];
                    for (int i = 0; i < havaGorevSayisi; i++)
                    {
                        havaGorevleri[i] = -1;
                    }

                    for (int i = 0; i < havaGorevSayisi; i++)
                    {
                        havaGorevleri[i] = uret.Next(16, 24);

                        for (int j = 0; j < havaGorevSayisi; j++)
                        {
                            if (i == j)
                            {
                                continue;
                            }
                            while (havaGorevleri[i] == havaGorevleri[j])
                            {
                                havaGorevleri[i] = uret.Next(16, 24);
                                j = 0;
                            }
                        }
                    }

                    for (int i = karaGorevSayisi; i < tumGorevler.Length; i++)
                    {
                        tumGorevler[i] = havaGorevleri[i - karaGorevSayisi];
                    }

                }

                for (int i = 0; i < tumGorevler.Length; i++)
                {
                    liste.Items.Add(gorev[tumGorevler[i]].isim);

                }

            }

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            MessageBox.Show("Verdiği emeklerden dolayı Sarp Sarpaşan, Efe Ceylan ve Mehmet Söylenç'e teşekkürler.");
            gorev.Add(new Gorev("CAS", "Dost kara birimlerine yakın, düşman kara hedeflerine saldırı yapan pakettir."));
            gorev.Add(new Gorev("One Call CAS", "Düşmanla yakın temasta bulunan hareketli kara birimlerine yakın hava desteği sağlar.Keşif saldırı ve destek paktedir."));
            gorev.Add(new Gorev("Preplan CAS", "Düşmanla yakın temasta bulunan hareketli kara birliklerine yakın hava desteği sağlamak üzere ifa edilen saldırı görevidir.One call cas görevinden farkı keşif görevini üstlenmemesidir. Bu paketteki uçaklar doğrudan doğruya önceden belirlenmiş hedefleri imha etmeyi amaçlar."));
            gorev.Add(new Gorev("Interdiction", "Hareketli düşman kara birliklerinin ilerlemelerini durdurmak takviye birliklerin önünü kesmek ve düşmanı askeri desteklerden mahrum bırakmak üzere gerçekleştirilen saldırı görevidir."));
            gorev.Add(new Gorev("Recon", "Düşmana ait belirli askeri ve stratejik noktaların konumlarını belirlemek ve fotoğraflarını elde etmek amacıyla gerçekleştirilen keşif görevidir."));
            gorev.Add(new Gorev("Patrol", "Belirli zamanlarda belirli bölgelerde gerçekleştirilen devriye görevidir."));
            gorev.Add(new Gorev("Recon Patrol", "Belirli zamanlarda belirli bölgelerde gerçekleştirilen keşif devriye görevidir."));
            gorev.Add(new Gorev("TASMO", "Düşman deniz birimlerini yok etmek amacıyla icra edilen saldırı görevi."));
            gorev.Add(new Gorev("BDA", "Dost birlikler tarafından vurulmuş hedeflerin durumlarını belirlemek ve fotoğraflarını elde etmek amacıyla gerçekleştirilen istihbarat amaçlı saldırı sonrası görevdir."));
            gorev.Add(new Gorev("FAC", "Kara hedeflerini tespit etmek ve hedeflerin koordinatları ile ilgili kara ve hava saldırı birliklerine bildirmek üzere gerçekleştirilen keşif görevidir."));
            gorev.Add(new Gorev("Deep Strike", "Düşmanın önceden belirlenen korunaklı ve yüksek öncelikli kara hedeflerine yönelik strike görevine göre daha spesifik(özgü) görevleri olan bir saldırı görevidir."));
            gorev.Add(new Gorev("Strike", "Fabrikalar ,köprüler,askeri tesisler,lojistikler,kimyasal endüstri gibi üretim yapan tesisleri kara hedefleri gibi imha ederek düşman askeri ve lojistik strateji açısından  katkı sağlayabilecek tüm hedeflerin yok edilmesi görevidir."));
            gorev.Add(new Gorev("OCA Strike", "Düşmanın havalimanı, pist, hangar, cephanelik gibi hava unsurlarına saldırı görevidir. Amaç düşmanın hava sahasına çıkmasını engellemek veya geciktirmedir."));
            gorev.Add(new Gorev("SEAD Strike", "Hava savunma sistemlerini imha etmeyi amaçlayan görevdir.Doğrudan hedefleri yok etmeyi amaçlar."));
            gorev.Add(new Gorev("SEAD Escort", "Görevi yerine getirecek dost birlikleri düşman hava savunma sistemlerinden korumak üzere gerçekleştirilen escort görevi."));
            gorev.Add(new Gorev("Escort", "Görevi yerine getirecek dost birimlerin kalkıştan ya da buluşma noktasından itibaren havadan  gelecek  tehditlere karşı koruma görevidir."));
            gorev.Add(new Gorev("Intercept", "Düşman uçakları tarafından gerçekleştirileceği belirlenen operasyonların durdurulması ve düşman unsurlarının imha edilmesi amaçlanan görevdir."));
            gorev.Add(new Gorev("Sweep", "Önceden belirlenen bir bölge içerisinde  hava hakimiyetini sağlamak üzere gerçekleştirilen Hava-Hava görevidir."));
            gorev.Add(new Gorev("Ambush CAP", "Alçak irtifada dağların veya uçağın korunmasını sağlayacak unsurlara sığınarak düşman uçaklarını sıkıştırmak ve imha etmek üzere gerçekleştirilen görevdir."));
            gorev.Add(new Gorev("RESCAP", "Çeşitli nedenlerle düşman bölgesinde kalan dost personeli kurtarmak için havadan ve karadan gelebilecek tehditlere karşı korumak için gerçekleştirilen devriye uçuşu."));
            gorev.Add(new Gorev("TARCAP", "Belirli bir bölge içerisinde dost hava varlıkların güvenliğini sağlamak için gerçekleştirilen devriye uçuşu."));
            gorev.Add(new Gorev("HAVCAP", "Yüksek değerli varlıkları korumakla yükümlü hava birimi,önceden belirlenen bir hava koridorunda ve zamanda gerçekleşen devriye uçuşu."));
            gorev.Add(new Gorev("BARCAP", "Bariyer Savaş Hava Devriyesi, ön safta koruma olarak adlandırılabilir. Örneğin DCA paketinin etrafında, gelebilecek ilk müdahaleye tepki veren paket."));
            gorev.Add(new Gorev("DCA", "Belirli bir bölgedeki dost varlıkları ya da belirli bir alanı korumak üzere gerçekleştirilen devriye görevidir."));
        }

        private void liste_SelectedIndexChanged(object sender, EventArgs e)
        {
            int si = liste.SelectedIndex;
            lblAciklama.Text = gorev[tumGorevler[si]].isim + ": " + gorev[tumGorevler[si]].aciklama;
        }
    }
}
