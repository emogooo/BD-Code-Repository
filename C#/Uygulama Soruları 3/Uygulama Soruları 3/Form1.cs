using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Uygulama_Soruları_3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Random rastgele = new Random();
            int a = 0, b = 0, c = 0, d = 0;
            while(!(((a+b+c)>100)&&((int)Math.Pow(c, 2) == (int)Math.Pow(a, 2) + (int)Math.Pow(b, 2)))) // a+b+c toplamı 100 den küçük olduğu ve c2, a2+b2 olmadığı müddetçe rastgele sayı üret.
            {
                a = rastgele.Next(0, 50);
                b = rastgele.Next(0, 50);
                c =(int)Math.Sqrt((int)Math.Pow(a, 2) + (int)Math.Pow(b, 2)); // c = kök içinde (a2+b2)
                
            }
            textBox1.Text = a.ToString();
            textBox2.Text = b.ToString();
            textBox3.Text = c.ToString();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            label4.Text = "a2+b2=c2 olmak üzere a+b+c toplamı 100’den büyük \n olan ilk dik üçgeni kenar uzunlukları ile yazınız.";
        }
    }
}
