using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Bütünleme_Soruları_2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
            Random rastgele = new Random();
            int a = 0, i = 1, i2 = 0, kontrol = 0, kontrol2 = 0, tekler = 0, ciftler = 0;
            double toplam = 0, toplam2 = 0;
            while (a!=2017)
            {
                a = rastgele.Next(1000, 10000);



                if (a%3==0 && a%5==0) // b kısmı
                {
                    i2++;
                }                     // 




                for (int c= 2; c<a; c++) // c kısmı
                {
                    if(a%c==0)
                    {
                        kontrol = 0;
                        break;
                    }
                    else
                    {
                        kontrol = 1;
                        
                    }
                }
                if(kontrol==1)
                {
                    toplam2 += a;
                    kontrol2++;
                }                      //




                if(a%2==0)            // d kısmı
                {
                    ciftler += a;
                }
                else if(a%2==1)
                {
                    tekler += a;
                }                   // 
                 




                listBox1.Items.Add(i+". "+a);
                i++;
                toplam += a;
            }

            listBox1.Items.Add("");
            listBox1.Items.Add("");
            listBox1.Items.Add("Tüm sayıların ortalaması = "+toplam/(i-1));


            textBox1.Text = i2.ToString();
            textBox2.Text = (toplam2 / kontrol2).ToString();
            textBox3.Text = (ciftler - tekler).ToString();
        }
    }
}
