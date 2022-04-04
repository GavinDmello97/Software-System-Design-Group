// container interface
public interface Container {
  // getIterator is used to access the implemented iterator subclass
  public Iterator getIterator(boolean isGraduated, boolean isFourPointer);
}
