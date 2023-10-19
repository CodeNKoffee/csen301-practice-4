public class Duplicates {
  public static StackObj createDuplicates(StackObj str, StackObj num) {
    int numSize = num.size();
    StackObj duplicateNum = new StackObj(numSize);
    
    // Copy elements from num to duplicateNum
    for (int i = 0; i < numSize; i++) {
      duplicateNum.push(num.top());
      num.pop();
    }

    int resSize = 0;
    for (int i = 0; i < numSize; i++) {
      resSize += (int) duplicateNum.pop();
    }

    StackObj res = new StackObj(resSize);

    for (int i = 0; i < numSize; i++) {
      num.push(duplicateNum.pop());
    }

    for (int i = 0; i < numSize; i++) {
      int repetitions = (int) num.top();
      num.pop();
      String name = (String) str.top();
      str.pop();
      for (int j = 0; j < repetitions; j++) {
        res.push(name);
      }
    }

    return res;
  }

  public static void main(String[] args) {
    StackObj names = new StackObj(3);
    names.push("Slim");
    names.push("Wael");
    names.push("Catherine");
    StackObj numbers = new StackObj(3);
    numbers.push(2);
    numbers.push(3);
    numbers.push(1);
    StackObj result = createDuplicates(names, numbers);
    result.printStack();
  }
}
