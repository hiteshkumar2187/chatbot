using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChatBot_Interfaces
{
    public abstract class UIInteractions
    {
        public abstract void GiveInput(object input);

        public PullOutput TakeOutput;
    }

    public delegate void PullOutput(string output);
}