using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Final_Soruları_3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || textBox1.Text == "+" || textBox1.Text == "-" || textBox1.Text == "/" || textBox1.Text == "*" || textBox1.Text == "0" || textBox1.Text == "," || textBox1.Text == ".")
                MessageBox.Show("Lütfen bir sayı giriniz!.");
            else
            {
                listBox1.Items.Clear();
                int a = 0;
                a = Int32.Parse(textBox1.Text);
                listBox1.Items.Add(a);
                do
                {
                    if (a % 2 == 0)
                    {
                        a /= 2;
                        listBox1.Items.Add(a);
                    }
                    else
                    {
                        a *= 3;
                        a += 1;
                        listBox1.Items.Add(a);
                    }
                } while (a != 1);
            }
            

        }
    }
}
