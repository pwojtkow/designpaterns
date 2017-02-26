Singleton

- trudne testowanie
- nie mozna zamockowac
- zabezpieczyc sie przed klonowaniem

-------------------------

Fabryka

Fabryka ogumienie - opony zimowe i opony letnie ale tylko opony

+ tworzenie statycznej klasy fakryki : tylko jeden obiekt
+ czasami tworzymy fabryki żeby zhermetyzowac tworzenie obiektu

class AnimalFactory {
	public Animal create() {
		return new Animal(arg1, arg2, arg3, arg4) // nie martwimy sie o kolejnosc argumentow itd
	}
}

+ jesli mamy w kodzie wiele new Cat() a chcemy zmienic na new Dog(), zmieniamy tylko logike w Factory


- statyczn fabryka ma problem z wstrzykiwaniem zaleznosci
new Human(new AnimalFactory(cat)) dla statycznej nie zadziala -> new Human(new AnimalFactory(<STATYCZNA KLASA>)

-------------------------

Fabryka abstrakcyjna

Fabryka BMW - produkuje i okna i silniki itd

kod w repo

------------------------

Adapter

Eclipse -> FrenchCodeLegacy projekt (adapter obiektowy)

wersja obiektowa lepsze niz klasowa

operacje na plikach (sciezki na Windows i Linux) => mapowania
w hibernate mapowaina sqli pomiedzy roznymi silnikami bazodanowymi

czesciej sie czyta niz tworzy

------------------------

Template Method

Schemat dzialania jest podobny, niuanse sie zmieniaja (raport z banku na telefon, na maila, poczta) / (zakonczyc zadanie z Jiry: analiza problemu, implementacja, dokumentacja -> kazdy programista korzysta z innych narzedzi itd.)

interface Developer {
		void analize();
		void implement();
		void createDoc();
}

class JavaDevImpl implements Developer {
	void analize() {
		//...
	}
	void implement(){
		//....
	}
	void createDoc(){
		//..
	}
	
	class ScalaDevImpl implements Developer {
	void analize() {
		//...
	}
	void implement(){
		//....
	}
	void createDoc(){
		//..
	}
	
	Developer javaDev = new JavaDevImpl();
	Developer scalaDev = new ScalaDevImpl();
	
	javaDev.analize();
	javaDev.implement();
	javaDev.createDoc(); // słabe to troche :/
	
	ZAMIAST TEGO WYZEJ ZMIENIAMY:
	- interfejs na klase abstrakcyjna i:
	
abstract class Developer {
		void analize();
		void implement();
		void createDoc();
		void completeTask() {
			analize();
			implement();
			createDoc();
		}
}

class JavaDevImpl extends Developer {
	void analize() {
		//...
	}
	void implement(){
		//....
	}
	void createDoc(){
		//..
	}
	
	class ScalaDevImpl extends Developer {
	void analize() {
		//...
	}
	void implement(){
		//....
	}
	void createDoc(){
		//..
	}
	
	Developer javaDev = new JavaDevImpl();
	Developer scalaDev = new ScalaDevImpl();
	
	javaDev.completeTask();
	scalaDev.completeTask();
	
}

============================

Proxy

interface Cart {
	
	void addProduct(Object o);
	void checkout();
}

interface Persist {
	void set(String key, String value);
}

class SessionPersistImpl implements Persist {
	void set(String key, String value)
	//...
}

class DatabasePersistImpl implements Persist {
	void set(String key, String value)
	//...
}

class CartProxy implements Cart{
	// atrybut persist

	public CartProxy(Persist persist) {
		this.persist = persist;
	}
	public void addProduct(Object o) {
		persist.set("user_id", o.toString());
	}
	public void checkout() {
		// przekazujemy obiekty do cartdatrabase (do listy) i wywolujemy checkout z cartdatabase
	}
}

class CartDatabase implements Cart{
	// atrybut persist
	List<Object> products = new ArrayList<Object>();
	public DatabaseProxy(Persist persist) {
		this.persist = persist;
	}
	public void addProduct(Object o) {
		persist.set(Enctypt.md5(random()), o.toString());
		products.add(o);
	}
}
	
void main(String[] args) {
		Cart cart = new CartProxy();
		cart.add("Mleko");
		cart.add("Jajka");
		cart.add("Kiełba");
		
		cart.checkout();
}

============================

Dekorator

zdobywanie ekwipunku po przejściu planszy, leveli

uzywac zamiast wymuszonego dziedziczenia, lub gdy klasa jest oznaczona jako finaly to mozemy ja rozszerzyc

============================

Budowniczy

podział na trzy działy:

Produkty             | Budowniczy | Dyrektor

wylewka,             | murarz     |
fundament,           |            |
wiezba dachowa,      | dekarz     |
instalacja el.       | elektryk   |


Query q = new Query();
q.select("u.name");
q.from("users as u");
q.where("u.name LIKE Lesz%");
q.limit(10);
q.orderby("u.date_of_birth");
q.execute();

lub jesli kazda metoda wywoluje "return this":

q.select("u.name");
	.from("users as u");
	.where("u.name LIKE Lesz%");
	.limit(10);
	.orderby("u.date_of_birth");
	.execute();
	
TA OPCJA NAZYWA SIE FLUENT INTERFACE

=============================
 Bridge

przekazujemy do konstruktora cos co chcemy polaczyc zd soba

=============================
Chain of reponsibility 

eclipse projekt

============================
null object - domysla wartrosc dla wszystkiego to null, potem nadpisujemy jak chcemy. wieksze bezpieczenstwo przed null pointer

===========================

Fasada

==========================

Stan

==========================

Wizytator

==========================

Obserwator - event dispatcher

kod w Eclipse  
