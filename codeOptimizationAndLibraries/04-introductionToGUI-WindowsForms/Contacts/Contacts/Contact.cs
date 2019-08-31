/**
 * Form1.cs - Contact class
 * 
 * @author Adrián Navarro Gabino
 */

namespace Contacts
{
    class Contact
    {
        protected string name;
        protected int age;
        protected string phone;

        public Contact(string name, int age, string phone)
        {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }

        public string GetName() { return name; }
        public int GetAge() { return age; }
        public string GetPhone() { return phone; }

        public override string ToString()
        {
            return name + " (" + age + "): " + phone;
        }
    }
}
