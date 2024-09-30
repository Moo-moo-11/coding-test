class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1) {
            arr[0] = -1
            return arr
        }
        
        val answer = IntArray(arr.size - 1)
        
        val list = arr.toMutableList()
            .also { it.remove(arr.minOrNull()) }
        
        for ((index,value) in list.withIndex()) {
            answer[index] = value
        }
        
        return answer
    }
}
