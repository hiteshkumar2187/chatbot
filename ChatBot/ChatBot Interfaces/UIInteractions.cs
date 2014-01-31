using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChatBot_Interfaces
{
    public interface UIInteractions
    {
        void GiveInput(object input);

        string TakeOutput();

        bool Ready
        {
            get;
        }
    }
}