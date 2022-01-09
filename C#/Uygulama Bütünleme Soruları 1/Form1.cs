using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Bütünleme_Soruları_1
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
            listBox1.Items.Add(" ");
            for (int i=0; i<9; i++)
            {
                listBox1.Items.Add("   " +i + "1" + " " + i + "2" + " " + i + "3" + " " + i + "4" + " " + i + "5" + " " + i + "6" + " " + i + "7" + " " + i + "8" + " " + i + "9");
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
