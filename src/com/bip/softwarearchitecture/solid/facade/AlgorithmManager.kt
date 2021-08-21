package com.bip.softwarearchitecture.solid.facade

/**
 * Not like Strategy Pattern. Will not change action at runtime.
 */
class AlgorithmManager {
    private var bubbleSort: Algorithm? = null

    private var selectionSort: Algorithm? = null

    private var insertionSort: Algorithm? = null

    constructor() {
        insertionSort = InsertionSort()
        bubbleSort = BubbleSort()
        selectionSort = SelectionSort()
    }

    fun doBubleSort() {
        this.bubbleSort!!.sort()
    }

    fun doSelectionSort() {
        this.selectionSort!!.sort()
    }

    fun doInsertionSort() {
        this.insertionSort!!.sort()
    }
}