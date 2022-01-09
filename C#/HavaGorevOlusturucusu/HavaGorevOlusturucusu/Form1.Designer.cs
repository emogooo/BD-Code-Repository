namespace HavaGorevOlusturucusu
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.btnOlustur = new System.Windows.Forms.Button();
            this.tbKara = new System.Windows.Forms.TextBox();
            this.tbHava = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.liste = new System.Windows.Forms.ListBox();
            this.lblAciklama = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnOlustur
            // 
            this.btnOlustur.BackColor = System.Drawing.Color.White;
            this.btnOlustur.Location = new System.Drawing.Point(236, 82);
            this.btnOlustur.Name = "btnOlustur";
            this.btnOlustur.Size = new System.Drawing.Size(75, 57);
            this.btnOlustur.TabIndex = 0;
            this.btnOlustur.Text = "Oluştur";
            this.btnOlustur.UseVisualStyleBackColor = false;
            this.btnOlustur.Click += new System.EventHandler(this.btnOlustur_Click);
            // 
            // tbKara
            // 
            this.tbKara.Location = new System.Drawing.Point(287, 12);
            this.tbKara.Name = "tbKara";
            this.tbKara.Size = new System.Drawing.Size(100, 20);
            this.tbKara.TabIndex = 1;
            this.tbKara.Text = "0";
            // 
            // tbHava
            // 
            this.tbHava.Location = new System.Drawing.Point(287, 38);
            this.tbHava.Name = "tbHava";
            this.tbHava.Size = new System.Drawing.Size(100, 20);
            this.tbHava.TabIndex = 2;
            this.tbHava.Text = "0";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Location = new System.Drawing.Point(186, 38);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(95, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Hava Görev Sayısı";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Location = new System.Drawing.Point(186, 15);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(91, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "Kara Görev Sayısı";
            // 
            // liste
            // 
            this.liste.BackColor = System.Drawing.SystemColors.Control;
            this.liste.FormattingEnabled = true;
            this.liste.Location = new System.Drawing.Point(12, 15);
            this.liste.Name = "liste";
            this.liste.Size = new System.Drawing.Size(143, 277);
            this.liste.TabIndex = 5;
            this.liste.SelectedIndexChanged += new System.EventHandler(this.liste_SelectedIndexChanged);
            // 
            // lblAciklama
            // 
            this.lblAciklama.BackColor = System.Drawing.Color.White;
            this.lblAciklama.Location = new System.Drawing.Point(161, 181);
            this.lblAciklama.Name = "lblAciklama";
            this.lblAciklama.Size = new System.Drawing.Size(236, 111);
            this.lblAciklama.TabIndex = 6;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(399, 313);
            this.Controls.Add(this.lblAciklama);
            this.Controls.Add(this.liste);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.tbHava);
            this.Controls.Add(this.tbKara);
            this.Controls.Add(this.btnOlustur);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Form1";
            this.Text = "H.K.K Görev Oluşturma Sihirbazı";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnOlustur;
        private System.Windows.Forms.TextBox tbKara;
        private System.Windows.Forms.TextBox tbHava;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ListBox liste;
        private System.Windows.Forms.Label lblAciklama;
    }
}

