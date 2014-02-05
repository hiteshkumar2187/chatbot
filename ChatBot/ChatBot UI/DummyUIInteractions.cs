using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ChatBot_Interfaces;

namespace ChatBot_UI
{
    class DummyUIInteractions : UIInteractions
    {
        public DummyUIInteractions()
        {
            mOutput = String.Empty;

            mLock = new object();
        }

        public override void GiveInput(object input)
        {
            lock (mLock)
            {
                ProcessInput((string)input);
            }
        }

        private void ProcessInput(string input)
        {
            mOutput = "Output Test";

            if (TakeOutput != null)
                TakeOutput(mOutput);
        }


        private string mOutput;
        private object mLock;
    }
}
