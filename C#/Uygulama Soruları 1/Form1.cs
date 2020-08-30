using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Soruları_1
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
                MessageBox.Show("Lütfen kaçıncı elemanı bulmak istediğinizi yazın!.");
            else
            {
                listBox1.Items.Clear();
                long a = 1, b = 0, c = 0, d = 1, d1 = 2;
                c = Convert.ToInt32(textBox1.Text);
                for (int i = 1; i <= c / 2; i++)
                {
                    listBox1.Items.Add(d+". eleman = "+ b);
                    a = a + b;
                    b = a + b;
                    listBox1.Items.Add(d1+". eleman = "+a);
                    d+=2;
                    d1+=2;
                }
                if (c % 2 == 1)
                {
                    listBox1.Items.Add(d +". eleman = "+b);
                }
                
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            label2.Text = "Sıfırdan başlayıp kendinden önceki\nson iki sayının toplamı ile elde edilen sayı dizisi ";
        }
    }
}
