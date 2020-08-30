using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int si = listBox1.SelectedIndex;
            textBox1.Text=si+"";
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            listBox1.Items.Add("a");
            listBox1.Items.Add("b");
            listBox1.Items.Add("c");
            listBox1.Items.Add("d");
            listBox1.Items.Add("e");
            listBox1.Items.Add("f");
        }
    }
}
