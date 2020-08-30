using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace MyFirstDBProject
{
    public partial class Form1 : Form
    {

        SqlCommand komut = new SqlCommand();
        SqlCommand komut2 = new SqlCommand();
        SqlConnection baglanti = new SqlConnection("Data Source=DESKTOP-V97LOGE;Initial Catalog=TaksitDeneme;Integrated Security=True");
        public Form1()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            komut.CommandText = "select * from musteri";
            komut.Connection = baglanti;
            DataTable dt = new DataTable();
            baglanti.Open();
            dt.Load(komut.ExecuteReader());
            baglanti.Close();
            dgwMusteri.DataSource = dt;
        }

        private void dgwMusteri_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            taksitGetir(Convert.ToInt32(dgwMusteri.CurrentRow.Cells[0].Value));
        }

        public void taksitGetir(int x)
        {
            komut.CommandText = "SELECT tutar FROM taksit WHERE musteriNo =" + x;
            komut2.CommandText = "SELECT SUM(tutar) FROM taksit WHERE musteriNo=" + x;
            komut.Connection = baglanti;
            komut2.Connection = baglanti;
            DataTable dt = new DataTable();
            DataTable dt2 = new DataTable();
            baglanti.Open();
            dt.Load(komut.ExecuteReader());
            dt2.Load(komut2.ExecuteReader());
            baglanti.Close();
            double toplam = Convert.ToDouble(dt2.Rows[0][0].ToString());
            dgwTaksit.DataSource = dt;
            lblFiyat.Text = toplam+"";
        }

    }
}
