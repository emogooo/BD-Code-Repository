using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Final_Soruları_2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {
           
        }
        int sorus = 0, puan = 0, a = 0, b = 0, c = 0, d = 0;
        Random rastgele = new Random();
        

        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";

            sorus++;

            if (sorus == 11)
            {
                MessageBox.Show("Sınav bitti. Toplam puanınız = " + puan);
                this.Close();
            }

            textBox6.Text = sorus.ToString();

            do
            {
                a = rastgele.Next(1, 21);
                b = rastgele.Next(1, 21);
                c = (int)Math.Sqrt((int)Math.Pow(a, 2) + (int)Math.Pow(b, 2));
            } while (!((c <= 20) && ((int)Math.Pow(c, 2) == (int)Math.Pow(b, 2) + (int)Math.Pow(a, 2))));

            d = rastgele.Next(0, 3);
            if(d==0)
            {
                textBox1.Text = a.ToString();
                textBox2.Text = b.ToString();
                label4.Text = "Aşağıda verilen bilgilere göre dik \n üçgenin hipotenüsünün uzunluğu nedir?";
                
            }
            else if(d==1)
            {
                textBox1.Text = a.ToString();
                textBox3.Text = c.ToString();
                label4.Text = "Aşağıda verilen bilgilere göre dik \n üçgenin yükseklik uzunluğu nedir?";
                if (textBox4.Text == b.ToString())
                {
                    puan += 10;
                }
            }
            else if(d==2)
            {
                textBox2.Text = b.ToString();
                textBox3.Text = c.ToString();
                label4.Text = "Aşağıda verilen bilgilere göre dik \n üçgenin taban uzunluğu nedir?";
                if (textBox4.Text ==a.ToString())
                {
                    puan += 10;
                }
            }
            

        }
        private void button2_Click(object sender, EventArgs e)
        {
            if (d == 0)
            {
                if (textBox4.Text == c.ToString())
                {
                    puan += 10;
                }
            }
            if (d == 1)
            {
                if (textBox4.Text == b.ToString())
                {
                    puan += 10;
                }
            }
            if (d == 2)
            {
                if (textBox4.Text == a.ToString())
                {
                    puan += 10;
                }        
            }
            textBox5.Text = puan.ToString();
            MessageBox.Show("Sonraki soruya geçiniz.");
        }
    }
}
