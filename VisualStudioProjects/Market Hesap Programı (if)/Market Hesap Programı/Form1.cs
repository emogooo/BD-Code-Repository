using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Market_Hesap_Programı
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int cips = 0, cips2 = 0, kola = 0, su = 0, cikolata = 0, kek = 0;
            double suy = 0, keky = 0, hesap = 0;
            listBox1.Items.Clear();

            if((checkBox1.Checked==false)&&(textBox1.Text!=""))
            {
                checkBox1.Checked = true;
                MessageBox.Show("Lütfen birdahaki sefere kutucuğu işaretleyin!");
            }

            if ((checkBox2.Checked == false) && (textBox2.Text != ""))
            {
                checkBox2.Checked = true;
                MessageBox.Show("Lütfen birdahaki sefere kutucuğu işaretleyin!");
            }

            if((checkBox3.Checked == false) && (textBox3.Text != ""))
            {
                checkBox3.Checked = true;
                MessageBox.Show("Lütfen birdahaki sefere kutucuğu işaretleyin!");
            }

            if ((checkBox4.Checked == false) && (textBox4.Text != ""))
            {
                checkBox4.Checked = true;
                MessageBox.Show("Lütfen birdahaki sefere kutucuğu işaretleyin!");
            }

            if ((checkBox5.Checked == false) && (textBox5.Text != ""))
            {
                checkBox5.Checked = true;
                MessageBox.Show("Lütfen birdahaki sefere kutucuğu işaretleyin!");
            }

            if (((checkBox1.Checked)&&(textBox1.Text==""))||((checkBox2.Checked)&&(textBox2.Text=="")) || ((checkBox3.Checked) && (textBox3.Text == "")) || ((checkBox4.Checked) && (textBox4.Text == "")) || ((checkBox5.Checked) && (textBox5.Text == "")))
            {
                MessageBox.Show("Lütfen kaç adet ürün alındığını yazınız!");
            }

            else
            {
                if (checkBox1.Checked)
                {
                    cips = Convert.ToInt16(textBox1.Text);
                    cips2 = cips * 2;
                    listBox1.Items.Add(cips +" Adet Cips " + cips2 +" TL.");

                }

                if (checkBox2.Checked)
                {
                    kola = Convert.ToInt16(textBox2.Text);
                    listBox1.Items.Add(kola +" Adet Kola "+ kola +" TL.");
                }

                if (checkBox3.Checked)
                {
                    su = Convert.ToInt16(textBox3.Text);
                    suy = su * 0.5;
                    listBox1.Items.Add(su +" Adet Su "+ suy +" TL.");
                }

                if (checkBox4.Checked)
                {
                    cikolata = Convert.ToInt16(textBox4.Text);
                    listBox1.Items.Add(cikolata +" Adet Çikolata " + cikolata + " TL.");
                }

                if (checkBox5.Checked)
                {
                    kek = Convert.ToInt16(textBox5.Text);
                    keky = kek * 0.5;
                    listBox1.Items.Add(kek +" Adet Kek "+ keky +" TL.");

                }

                hesap = cips2 + kola + suy + cikolata + keky;
                listBox1.Items.Add("-----------------------------------------------------------");

                if ((hesap >= 50) && (hesap<100))
                {
                    hesap = hesap * 0.89;
                    listBox1.Items.Add("Toplam hesaba % 11 indirim uygulanmıştır.");
                }

                else if (hesap >= 100)
                {
                    hesap = hesap * 0.78;
                    listBox1.Items.Add("Toplam hesaba % 22 indirim uygulanmıştır.");
                }

                listBox1.Items.Add("");
                listBox1.Items.Add("Toplam hesabınız " + hesap + " TL'dir.");
            }
        }

    }
}
