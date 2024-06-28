public class ApplePieRecipe {

    private Ingredient butter;
    private Ingredient sugar;
    private Ingredient flour;
    private Ingredient egg;
    private Ingredient vanillaSugar;
    private Ingredient salt;
    private Ingredient apples;
    private Ingredient cristalSugar;
    private Ingredient cinnamon;
    private Ingredient breadcrumbs;

    public ApplePieRecipe() {
        butter = new Ingredient("ongezouten roomboter",200,"gram" );
        sugar = new Ingredient("witte bastard suiker",200,"gram" );
        flour = new Ingredient("zelfrijzend bakmeel",400,"gram" );
        egg = new Ingredient("ei", 1, "stuk(s)");
        vanillaSugar= new Ingredient("vanillesuiker",1.5,"kilo" );
        salt= new Ingredient("zou",1,"snuf" );
        apples= new Ingredient("zoutzure appels",1.5,"kilo" );
        cristalSugar = new Ingredient("kristal suiker",75,"gram" );
        cinnamon = new Ingredient("kaneel",3,"theelepels" );
        breadcrumbs=new Ingredient("pannermeel",15,"gram" );

    }

    public void ingredientesTitulo() {
        System.out.println("INGREDIENTES");
    }

    public void printIngredients() {
        System.out.println(butter.getAmount() + " "+ butter.getUnit() +" "+ butter.getName());
        System.out.println(sugar.getAmount() + " "+ sugar.getUnit() + " "+sugar.getName());
        System.out.println(flour.getAmount() + " "+ flour.getUnit() +" "+ flour.getName());
        System.out.println(egg.getAmount() + " "+ egg.getUnit() + " "+egg.getName());
        System.out.println(vanillaSugar.getAmount()+ " "+vanillaSugar.getUnit()+" "+vanillaSugar.getName());
        System.out.println(salt.getAmount() + " "+ salt.getUnit() + " "+salt.getName());
        System.out.println(apples.getAmount() + " "+ apples.getUnit() +" "+ apples.getName());
        System.out.println(cristalSugar.getAmount()+ " "+ cristalSugar.getUnit()+" "+cristalSugar.getName());
        System.out.println(cinnamon.getAmount() + " "+ cinnamon.getUnit() +" "+ cinnamon.getName());
        System.out.println(breadcrumbs.getAmount() + " "+ breadcrumbs.getUnit() + " "+breadcrumbs.getName());
    }


    public void preparacionTitulo() {
        System.out.println("PREPARACION");
    }
    //Stappen

    public void voorVerwarm() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void klopEi(){
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mengIngredientent(){
        System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void schilApple() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void vetIn() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem");
    }
    public void bedekBodem() {
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void voellingTaart(){
        System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void strokendeeg(){
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void afwerking(){
        System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public void bakTaart(){
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }










}
