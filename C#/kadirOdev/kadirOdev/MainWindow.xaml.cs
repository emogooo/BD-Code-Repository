using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using Microsoft.Win32;
using System.IO;

namespace kadirOdev
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
       
        private void btKayit_Click(object sender, RoutedEventArgs e)
        {
            if (tbAd.Text == "" || tbFiyat.Text == "" || tbAciklama.Text == "")
            {
                MessageBox.Show("Lütfen kutucukları boş bırakmayın");
            }
            else
            {
                String ad = Convert.ToString(tbAd.Text);
                String fiyat = Convert.ToString(tbFiyat.Text);
                String aciklama = Convert.ToString(tbAciklama.Text);
                lbAd.Items.Add(ad);
                lbFiyat.Items.Add(fiyat);
                lbAciklama.Items.Add(aciklama);

                tbFiyat.Text = "";
                tbAd.Text = "";
                tbAciklama.Text = "";
            }
            

        }

        private void lbFiyat_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            try
            {
                tbFiyatGnc.Text = lbFiyat.SelectedItem.ToString();
            }
            catch
            {

              
            }
        }

        private void lbAd_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            try
            {
                tbAdGnc.Text = lbAd.SelectedItem.ToString();
            }
            catch
            {

              
            }
        }

        private void lbAciklama_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            try
            {
                tbAciklamaGnc.Text = lbAciklama.SelectedItem.ToString();
            }
            catch
            {

             
            }
        }

        private void btnAdGnc_Click(object sender, RoutedEventArgs e)
        {
            if (tbAdGnc.Text == "")
            {
                MessageBox.Show("Lütfen güncellemek istediğiniz ad satırını seçin.");
            }
            else
            {
                int secilenAd = lbAd.SelectedIndex;
                lbAd.Items.RemoveAt(secilenAd);
                lbAd.Items.Insert(secilenAd, tbAdGnc.Text);
                tbAdGnc.Text = "";
            }
            
        }

        private void btnFiyatGnc_Click(object sender, RoutedEventArgs e)
        {
            if (tbFiyatGnc.Text == "")
            {
                MessageBox.Show("Lütfen güncellemek istediğiniz fiyat satırını seçin.");
            }
            else
            {
                int secilenFiyat = lbFiyat.SelectedIndex;
                lbFiyat.Items.RemoveAt(secilenFiyat);
                lbFiyat.Items.Insert(secilenFiyat, tbFiyatGnc.Text);
                tbFiyatGnc.Text = "";
            } 
        }

        private void btAciklamaGnc_Click(object sender, RoutedEventArgs e)
        {
            if (tbAciklamaGnc.Text =="")
            {
                MessageBox.Show("Lütfen güncellemek istediğiniz açıklama satırını seçin.");
            }
            else
            {
                int secilenAciklama = lbAciklama.SelectedIndex;
                lbAciklama.Items.RemoveAt(secilenAciklama);
                lbAciklama.Items.Insert(secilenAciklama, tbAciklamaGnc.Text);
                tbAciklamaGnc.Text = "";
            }
            
        }

        private void button_Click(object sender, RoutedEventArgs e)
        {
            if (tbAdGnc.Text == "")
            {
                MessageBox.Show("Lütfen silmek istediğiniz ürünün adını seçin.");
            }
            else
            {
                int secilen = lbAd.SelectedIndex;
                lbAd.Items.RemoveAt(secilen);
                lbFiyat.Items.RemoveAt(secilen);
                lbAciklama.Items.RemoveAt(secilen);
                tbAdGnc.Text = "";
            }
            
        }

        string dosyaAdi = "";
        private void btDosyaSec_Click(object sender, RoutedEventArgs e)
        {
            dosyaAdi = "";
            OpenFileDialog fd = new OpenFileDialog();
            fd.Multiselect = true;
            fd.Filter = "Textfiles|*.txt| Log Files|*.log| All Files|*.*";
            fd.DefaultExt = ".txt";
            Nullable<bool> dO = fd.ShowDialog();
            
            if (dO == true)
            {
                string dosyaAdi2 = "";
                foreach (string dosyaAdi in fd.FileNames)
                {
                    dosyaAdi2 += ";" + dosyaAdi;
                }
                dosyaAdi2 = dosyaAdi2.Substring(1);

                tbDosyaYolu.Text = dosyaAdi2;
            }
        }

        private void btGetir_Click(object sender, RoutedEventArgs e)
        {
            if (tbDosyaYolu.Text == "")
            {
                MessageBox.Show("Lütfen dosyayı seçin.");
            }
            else
            {
                StreamReader sR = File.OpenText(tbDosyaYolu.Text);
                string metin;
                while((metin=sR.ReadLine())!= null)
                {
                    lbAd.Items.Add(metin);
                    lbFiyat.Items.Add(sR.ReadLine());
                    lbAciklama.Items.Add(sR.ReadLine());
                }
                sR.Close();
                tbDosyaYolu.Text = "";
            }
            
        }

        private void btGotur_Click(object sender, RoutedEventArgs e)
        {
            if (tbDosyaYolu.Text=="")
            {
                MessageBox.Show("Lütfen dosyayı seçin.");
            }
            else
            {
                StreamWriter yazici = new StreamWriter(tbDosyaYolu.Text);
                for (int i = 0; i < lbAd.Items.Count; i++)
                {
                    yazici.WriteLine(lbAd.Items[i].ToString());
                    yazici.WriteLine(lbFiyat.Items[i].ToString());
                    yazici.WriteLine(lbAciklama.Items[i].ToString());
                }
                yazici.Close();
                tbDosyaYolu.Text = "";
                MessageBox.Show("Metin belgesine yazma işlemi başarıyla tamamlanmıştır.");
            }
            
            
        }
    }
}
