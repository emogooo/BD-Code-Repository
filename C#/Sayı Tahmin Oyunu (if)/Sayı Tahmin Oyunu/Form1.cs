using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sayı_Tahmin_Oyunu
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        Random rastgele = new Random();
        int sayi = 0, tahmin = 0, sayac=0;

        private void Form1_Load(object sender, EventArgs e)
        {
            sayi = rastgele.Next(0, 500);
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
                textBox3.Text = sayi.ToString();
            else if (checkBox1.Checked == false)
                textBox3.Text = "";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            sayi = rastgele.Next(0, 500);
            sayac = 0;
            listBox1.Items.Clear();
            textBox1.Text = "";
            textBox2.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            tahmin = Convert.ToInt32(textBox1.Text);
            sayac++;
            if(tahmin>sayi)
            {
                textBox2.Text = "Aşağı inin.";
                listBox1.Items.Add(sayac +". Tahmininiz " + tahmin + " Aşağı inin. ");
            }
            else if(tahmin<sayi)
            {
                textBox2.Text = "Yukarı çıkın.";
                listBox1.Items.Add(sayac +". Tahmininiz " + tahmin + " Yukarı çıkın. ");
            }
            else
            {
                if (sayac == 1)
                {
                    MessageBox.Show("Hack kapa terbiyesiz");
                }
                else if (sayac != 1)
                {
                    textBox2.Text = "Tebrikler bildiniz!";
                    listBox1.Items.Add(sayac + ". Tahmininizde oyunu kazandınız. TEBRİKLER!");
                    MessageBox.Show("Hll len morq");
                }
            }
        }
    }
}
