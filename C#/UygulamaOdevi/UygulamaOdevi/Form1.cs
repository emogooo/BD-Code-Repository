using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UygulamaOdevi
{
    public partial class Form1 : Form
    {
        int sayac = 49;
        int x = 1;
        
        
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = (sayac+= x) + "";
            if (sayac>50*x)
            {
                button2.Visible = true;
            }
            if(sayac>200&&sayac<205)
            {
                button3.Visible = true;
            }
            if (sayac >= (Int32.MaxValue/4)*3)
            {  
                this.Close();
                
            }
            if (sayac>100*x)
            {
                button4.Visible = true;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            x *= 2;
            button2.Visible = false;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            button1.PerformClick();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            timer1.Enabled = true;
            button3.Visible = false;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            timer1.Interval /= 2;
            label2.Text = timer1.Interval + "";
            if (timer1.Interval<=3)
            {
                button4.Visible = false;
            }
        }
    }
}
