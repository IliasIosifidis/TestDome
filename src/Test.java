void main() {
  var datas = new int[10];
  datas[1] = 1;
  datas[9] = Integer.parseInt(null);
  Arrays.stream(datas).forEach(System.out::println);
}