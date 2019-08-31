/**
 * Form1.cs - Main program
 * 
 * @author Adrián Navarro Gabino
 */

using System;
using System.Collections.Generic;
using System.IO;
using System.Windows.Forms;

namespace Contacts
{
    public partial class Form1 : Form
    {
        private List<Contact> contacts;

        public Form1()
        {
            InitializeComponent();

            contacts = new List<Contact>();

            if (File.Exists(@"data\contacts.txt"))
            {
                StreamReader file = File.OpenText(@"data\contacts.txt");

                string line = file.ReadLine();
                if (line != null)
                {
                    string[] data = line.Split(';');

                    for (int i = 0; i < (data.Length + 1) / 3; i++)
                    {
                        contacts.Add(new Contact(
                            data[i * 3],
                            Convert.ToInt32(data[i * 3 + 1]),
                            data[i * 3 + 2]));

                        lstContacts.Items.Add(contacts[contacts.Count - 1]);
                    }
                }

                file.Close();
            }
                
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            string name = txtName.Text;
            string ageAux = txtAge.Text;
            string phone = txtPhone.Text;

            if (name == "" || ageAux == "" || phone == "")
            {
                MessageBox.Show("Fields can't be empty");
            }
            else
            {
                try
                {
                    int age = Convert.ToInt32(ageAux);

                    contacts.Add(new Contact(name, age, phone));

                    txtName.Text = "";
                    txtAge.Text = "";
                    txtPhone.Text = "";

                    lstContacts.Items.Add(contacts[contacts.Count - 1]);

                    SaveData();
                }
                catch (FormatException)
                {
                    MessageBox.Show("Age must be a number");
                    txtAge.Text = "";
                }
            }
        }

        private void btnRemove_Click(object sender, EventArgs e)
        {
            contacts.RemoveAt(lstContacts.SelectedIndex);
            lstContacts.Items.RemoveAt(lstContacts.SelectedIndex);
            if (contacts.Count == 0)
                File.Delete(@"data\contacts.txt");
            else
                SaveData();
        }

        private void SaveData()
        {
            StreamWriter file = new StreamWriter(@"data\contacts.txt");

            file.Write(contacts[0].GetName() + ";" + contacts[0].GetAge() +
                ";" + contacts[0].GetPhone());

            for (int i = 1; i < contacts.Count; i++)
            {
                file.Write(";" + contacts[i].GetName() + ";" +
                    contacts[i].GetAge() + ";" + contacts[i].GetPhone());
            }

            file.Close();
        }
    }
}