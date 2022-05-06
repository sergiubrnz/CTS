package dp.factoryMethod;

public class FactoryPizzaRoma implements IFactory{

	@Override
	public IPizza crearePizza() {
		return new PizzaRoma();
	}

	

}
