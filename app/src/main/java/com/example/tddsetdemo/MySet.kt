package com.example.tddsetdemo

class MySet: MutableSet<String> {

    private var data: Array<String?> = arrayOf()

    override fun add(element: String): Boolean {
        data = data.copyOf(data.size+1)

        for(i in data) {
            if(i == element) {
                return false
            }
        }
        data[data.size-1] = element
        return true
    }

    override fun addAll(elements: Collection<String>): Boolean {

        var copy = data.copyOf(elements.size+data.size)

        for(i in elements) {

            if(copy.contains(i)) {
                return false
            } else {
                copy[data.size+elements.indexOf(i)] = i
            }
        }
        data = copy
        return true
    }

    override fun clear() {
        data = data.copyOf(0)
    }

    override fun iterator(): MutableIterator<String> {
        TODO("Not yet implemented")
    }

    override fun remove(element: String): Boolean {
        if(data.contains(element)) {
            /*var p1 = data.copyOfRange(0,indexOf(element)-1)
            var p2 = data.copyOfRange(indexOf(element),data.size)
            data = p1.plus(p2)
            println(data.toString())*/
            return true
        }
        return false
    }

    override fun removeAll(elements: Collection<String>): Boolean {
        TODO("Not yet implemented")
    }

    override fun retainAll(elements: Collection<String>): Boolean {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = data.size

    override fun contains(element: String): Boolean {
        for(i in data) {
            if(i == element) {
                return true
            }
        }
        return false
    }

    override fun containsAll(elements: Collection<String>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        if(data.isEmpty()) {
            return true
        }
        return false
    }
}