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
            mReady = false;
            mOutput = String.Empty;

            mLock = new object();
        }

        public void GiveInput(object input)
        {
            lock (mLock)
            {
                mReady = false;
                ProcessInput((string)input);
                mReady = true;
            }
        }

        public string TakeOutput()
        {
            if (mReady)
                return mOutput;
            else
                return String.Empty;
        }

        public bool Ready
        {
            get 
            {
                return mReady;
            }
        }

        private void ProcessInput(string input)
        {
            mOutput = "Output Test";
        }

        private string mOutput;
        private bool mReady;
        private object mLock;
    }
}
