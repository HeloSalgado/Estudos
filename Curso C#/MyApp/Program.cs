
namespace MeuApp
{
    internal class Program
    {
        static void Main(string[] args)
        {          
            Console.WriteLine("Qual seu nome?");
            var nome = Console.ReadLine();
            Console.WriteLine("Qual sua idade?");
            var idade = Convert.ToInt16(Console.ReadLine());

            var isMaiorDeIdade = idade >= 18;

            if(isMaiorDeIdade){
                Console.WriteLine(nome + ", pode ir pra festa!");
            } else {
                Console.WriteLine(nome + ", vai ficar em casa");
            }

        }

        public static void teste(){
            // Conversão implicita
            int inteiro = 100;
            float real = 25.5f;

            //real = inteiro; // 100.0f

            //// Conversao explicita
            //inteiro = (int)real;

            // Parse + Convert
            //inteiro = int.Parse(real.ToString());
            inteiro = Convert.ToInt32(real);

            Console.WriteLine(inteiro);
            Console.WriteLine(Convert.ToBoolean("true"));
        }
    }
}