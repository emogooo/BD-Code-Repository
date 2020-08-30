using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Soruları_2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int toplam = 0, a = 0, toplam2 = 0;
            for(int i = 1; i <=15; i++)
            {
                a = (int)Math.Pow(i, 2);
                toplam += a;
                toplam2 += i;
            }
            textBox1.Text = toplam.ToString();
            textBox2.Text = (toplam2*toplam2).ToString();
            textBox3.Text = (toplam2*toplam2 - toplam).ToString();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
