using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace GetStartedDebugging
{
    using System;

    class ArrayExample
    {
        static void Main()
        {
            char[] letters = { 'a', 'n', 'a',' ', 's', 'm', 'i', 't', 'h' };
                string name = "";
            int[] a = new int[10];
            for (int i = 0; i < letters.Length; i++)
            {
                name += letters[i];
                a[i] = i + 1;
                SendMessage(name, a[i]);
            }
            Console.ReadKey();
        }

        static void SendMessage(string name, int msg)
        {
            Console.WriteLine("Hello, " + name + "! Count to " + msg);
        }
    }
}
