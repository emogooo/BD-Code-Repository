using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Bütünleme_Soruları_3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(textBox1.Text=="")
            {
                MessageBox.Show("Lütfen hangi sayının asal çarpanlarını görmek istediğinizi yazın.");

            }
            else
            {
                int a = 0, kontrol = 0;
                a = Convert.ToInt32(textBox1.Text);
                listBox1.Items.Clear();
                if (a % 2 == 0)
                {
                    listBox1.Items.Add("2");
                }
                for (int asal = 2; asal < a; asal++)
                {
                    kontrol = 0;
                    if (a % asal == 0)
                    {
                        for (int i = 2; i < asal; i++)
                        {

                            if (asal % i == 0)
                            {
                                kontrol = 0;
                                break;
                            }

                            else
                            {
                                kontrol = 1;
                            }
                        }
                    }
                    if (kontrol == 1)
                    {
                        listBox1.Items.Add(asal);
                    }


                }
                int kontrol2 = 0;
                for (int i2 = 2; i2 < a; i2++)
                {
                    if (a % i2 == 0)
                    {
                        kontrol2 = 0;
                        break;
                    }
                    else
                    {
                        kontrol2 = 1;
                    }
                }
                if (kontrol2 == 1)
                    listBox1.Items.Add(a);
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
