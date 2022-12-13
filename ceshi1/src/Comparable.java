public interface Comparable<T>{
    default int compareTo(T other){return 0;}// 默认实现
}
