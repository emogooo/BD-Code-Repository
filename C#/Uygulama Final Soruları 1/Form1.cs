using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Final_Soruları_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
                MessageBox.Show("Lütfen kaçıncı elemanı bulmak istediğinizi giriniz!");
            else
            {
                listBox1.Items.Clear();
                long a = 1, b = 2, c = 3, d = 4, e1 = 0, s1 = 1, s2 = 2, s3 = 3, s4 = 4;
                e1 = Convert.ToInt32(textBox1.Text);
                for (int i = 1; i <= e1 / 4; i++)
                {
                    listBox1.Items.Add(s1 + ". eleman = " + a);
                    a = a + b + c + d;
                    listBox1.Items.Add(s2 + ". eleman = " + b);
                    b = a + b + c + d;
                    listBox1.Items.Add(s3 + ". eleman = " + c);
                    c = a + b + c + d;
                    listBox1.Items.Add(s4 + ". eleman = " + d);
                    d = a + b + c + d;
                    s1 += 4;
                    s2 += 4;
                    s3 += 4;
                    s4 += 4;
                }
                if (e1 % 4 == 1)
                {
                    listBox1.Items.Add(s1 + ". eleman = " + a);
                }
                else if (e1 % 4 == 2)
                {
                    listBox1.Items.Add(s1 + ". eleman = " + a);
                    listBox1.Items.Add(s2 + ". eleman = " + b);
                }
                else if (e1 % 4 == 3)
                {
                    listBox1.Items.Add(s1 + ". eleman = " + a);
                    listBox1.Items.Add(s2 + ". eleman = " + b);
                    listBox1.Items.Add(s3 + ". eleman = " + c);
                }
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            label2.Text = "Birden başlayıp kendinden önceki son dört sayının\n toplamı ile elde edilen sayı dizisi"; 
        }
    }
}
