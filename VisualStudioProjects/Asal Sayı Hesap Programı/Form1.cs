using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace For_Döngüsü
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text != "")
            {
                listBox1.Items.Add("1 asal değildir");
                int a1 = 0;
                a1 = Convert.ToInt32(textBox1.Text);
                int sayac = 0;
                for (int sayi = 2; sayi <= a1; sayi++)
                {
                    int kontrol = 0;
                    for (int i = 2; i < sayi; i++)
                    {
                        if (sayi % i == 0)
                        {
                            kontrol = 1;
                            break;
                        }

                    }
                    if (kontrol == 1)
                    {
                        listBox1.Items.Add(sayi + " asal değildir");
                    }
                    else
                    {
                        listBox1.Items.Add(sayi + " asaldır");
                        sayac++;
                    }
                }
                label1.Text = "1 ile " + a1 + " arasında " + sayac + " adet asal sayı vardır";
            }
            else
                MessageBox.Show("Lütfen kutucuğu boş bırakmayın!");
        }
             
    }
}
 

