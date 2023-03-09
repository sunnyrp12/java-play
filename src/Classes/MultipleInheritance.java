package Classes;

import Interfaces.TestInterface;
import Interfaces.TestInterfaceThree;
import Interfaces.TestInterfaceTwo;

public class MultipleInheritance implements TestInterface, TestInterfaceTwo, TestInterfaceThree {

    @Override
    public void checkInterfaceMethod() {

    }
}
