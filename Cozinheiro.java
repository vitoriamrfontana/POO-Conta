package lanchonete;

public class Cozinheiro {
    
        public void adicionarLancheNoBalcao(){
            System.out.println("ADICIONANDO LANCHE NO BALCAO");
        }
        public void adicionarSucoNoBalcao(){
            System.out.println("ADICIONANDO SUCO NO BALCAO");
        }
        public void adicionarComboNoBalcao(){
            adicionarLancheNoBalcao();
            adicionarSucoNoBalcao();
        }
        public void prepararLanche(){
            System.out.println("PREPARANDO O LANCHE");
        }
        public void prepararVitamina(){
            System.out.println("PREPARNDO VITAMINA");
        }
        public void prepararCombo(){
            prepararLanche();
            prepararVitamina();
        }
        public void selecionarIngredientesLanche(){
            System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
        }
        public void selecionarIngredientesVitamina(){
            System.out.println("SELECIONANDO A FRUTA, LEITE E SUCO");
        }
        public void lavarIngredientes(){
            System.out.println("LAVANDO INGREDIENTES");
        }
        public void baterVitaminaLiquidificador(){
            System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
        }
        
    }
    
