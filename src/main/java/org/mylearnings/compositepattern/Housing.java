package org.mylearnings.compositepattern;

import java.util.ArrayList;

public class Housing implements IStructure{
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address){
        this.structures =new ArrayList<>();
        this.address=address;
    }
    @Override
    public void enter() {
        System.out.println("enter");
    }

    @Override
    public void exit() {
        System.out.println("exit");
    }

    @Override
    public void location() {
        System.out.println("You are currently in "+this.getName()+"it has ");
        for (IStructure structure:this.structures)
            System.out.println(structure.getName());
    }

    @Override
    public String getName() {
        return this.address;
    }
    public int addStructure(IStructure component){
        this.structures.add(component);
        return this.structures.size()-1;
    }
    public IStructure getStructure(int componentNumber){
        return this.structures.get(componentNumber);
    }

}
