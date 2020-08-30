using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int by = 0, ba = 0, bg = 0, biy = 0, bia = 0, big = 0, yf = 0, af = 0, gf = 0, tf = 0;
            by = Convert.ToInt32(textBox1.Text);
            ba = Convert.ToInt32(textBox2.Text);
            bg = Convert.ToInt32(textBox3.Text);
            biy = Convert.ToInt32(textBox4.Text);
            bia = Convert.ToInt32(textBox5.Text);
            big = Convert.ToInt32(textBox6.Text);
            if (biy != by)
            {
                yf = ((biy - by)) * 365;
            }
            if (bia!=ba)
            {
                if (bia >= ba)
                {
                    af = ((bia - ba)) * 30;
                }
                else
                {
                    af = (12 - (ba - bia)) * 30;
                }
            }
            if(big>=bg)
            {
                gf = big - bg;
            }
            else
            {
                gf = big - bg;
            }

            tf = yf + gf + af;
            textBox7.Text = tf.ToString();
        }
    }
}
