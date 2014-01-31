using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using ChatBot_Interfaces;
using System.Threading;

namespace ChatBot_UI
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            mInteraction = new DummyUIInteractions();
        }

        private void OnClick(object sender, RoutedEventArgs e)
        {
            ParameterizedThreadStart method = new ParameterizedThreadStart(mInteraction.GiveInput);
            Thread InputThread = new Thread(method);
            InputThread.Start(inputTextBox.Text);

            WaitForOutput();
        }

        private void WaitForOutput()
        {
            while (!mInteraction.Ready)
            {

            }

            if (mInteraction.Ready)
            {
                ConversationBlock.Text = ConversationBlock.Text + "\n" + mInteraction.TakeOutput();
            }
        }

        private UIInteractions mInteraction;
    }
}
