import java.util.Random;

public class main {
    public static void main(String[] args) {
        ArvoreBinaria<Evento> arvore = new ArvoreBinaria<>();

        // 10 eventos para inserir
        Evento[] eventos = {
            new Evento("Tech Summit", "Conferência de tecnologia", "link1.com"),
            new Evento("Java Day", "Encontro sobre Java", "link2.com"),
            new Evento("AI Expo", "Exposição de Inteligência Artificial", "link3.com"),
            new Evento("CyberSec", "Evento de Segurança Cibernética", "link4.com"),
            new Evento("Cloud Week", "Semana da Computação em Nuvem", "link5.com"),
            new Evento("Game Jam", "Competição de desenvolvimento de jogos", "link6.com"),
            new Evento("Hackathon", "Maratona de programação", "link7.com"),
            new Evento("Startup Fair", "Feira de Startups", "link8.com"),
            new Evento("Big Data Conf", "Conferência de Big Data", "link9.com"),
            new Evento("IoT World", "Evento sobre Internet das Coisas", "link10.com")
        };

        // Inserindo em ordem aleatória
        Random random = new Random();
        for (int i = 0; i < eventos.length; i++) {
            int indice = random.nextInt(eventos.length);
            arvore.inserir(eventos[indice]);
        }

        // Impressões
        System.out.println("Impressão em ordem:");
        arvore.imprimeEmOrdem();
        System.out.println("\n");

        System.out.println("Impressão pré-fixada:");
        arvore.imprimePreFixado();
    }
}



// public class main {
//     public static void main(String[] args) {
//         Automovel auto1 = new Automovel("Marca1", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
//         ArvoreBinaria<Automovel> arvore = new ArvoreBinaria<>();
//         arvore.inserir(auto1);
//         Automovel auto2 = new Automovel("Marca2", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
//         Automovel auto3 = new Automovel("Marca3", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
//         Automovel auto4 = new Automovel("Marca4", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
//         Automovel auto5 = new Automovel("Marca5", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
//         Automovel auto6 = new Automovel("Marca6", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
//         arvore.inserir(auto4);
//         arvore.inserir(auto6);
//         arvore.inserir(auto3);
//         arvore.inserir(auto5);
//         arvore.inserir(auto2);
//         arvore.imprimeEmOrdem();
//         arvore.imprimePreFixado();
//     }
// }
