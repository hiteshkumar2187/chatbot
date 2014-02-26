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
using System.Windows.Forms;

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
            mInteraction.TakeOutput = GetOutput;
        }

        private void OnClick(object sender, RoutedEventArgs e)
        {
            ParameterizedThreadStart method = new ParameterizedThreadStart(mInteraction.GiveInput);
            Thread InputThread = new Thread(method);
            InputThread.Start(inputTextBox.Text);

            AddInteraction("Person", inputTextBox.Text);
        }

        private void AddInteraction(string sender, string text)
        {
            Dispatcher.Invoke((Action)(() =>
            {
                ConversationBlock.Text = ConversationBlock.Text + "\n" + text;
                ConversationScroller.ScrollToBottom();
            }));
        }

        public void GetOutput(string output)
        {
            AddInteraction("Chatbot", output);
        }

        private UIInteractions mInteraction;
    }
}
