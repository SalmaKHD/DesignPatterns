package structural.adapter.classadapter;

interface IntegerValueInterface {
   public int getInteger();

}

class IntegerValue implements IntegerValueInterface {
   @Override
   public int getInteger() {
      return 5;
   }
}

class ClassAdapter extends IntegerValue {
   @Override
   public int getInteger() {
      return 2+super.getInteger();
   }
}
