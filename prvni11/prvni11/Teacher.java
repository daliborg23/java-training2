package prvni11;

public class Teacher extends Employee
{
	private final int teachingTime;
	public Teacher(int age, int salary, int teachingTime)
	{
		super(age, salary);
		this.teachingTime = teachingTime;
	}
	@Override
	public void writeInfo()
	{
		super.writeInfo();
		System.out.println(", Oduceny cas: " + teachingTime);
	}
}

// 11.  Použití metody ToString()
// Vypište v hlavním programu informace o objektu studenta způsobem, jako by to byla proměnná primitivního typu, např.  Console.WriteLine(s1).
// V jakém tvaru se informace vypíše?
// Na dalším řádku napište: Console.WriteLine(s1.ToString())   vypíše se totéž, čímž je dokázáno, že WriteLine volá ToString().
// Jelikož tato metoda není definovaná v našem programu, tak se zřejmě dědí z třídy Object.
//
// Vytvořte ve třídě Person překrytí metody ToString() třídy Object. Nejprve neuvedeme klíčové slovo override.
// Zjistíme, že tentokrát oba řádky WriteLine stejné nejsou. Řádek WriteLine(s1) tuto metodu nevolá, píše postaru Prvni12.Student. Proč?
// Co se stane, když napíšeme malé „t", tedy toString (a vysvětlit)

// Ještě doplňte překrytí ToString např. ve třídě Student. Použije se virtual override?
// 2. krok: chceme - li vracet řetězec pěkně formátovaný, použijeme String.Format. Vyzkoušíme ve třídě Student. Povšimněte si,
// že metoda Format je statická, metoda ToString instanční.

