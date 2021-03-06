/*     / \____  _    _  ____   ______  / \ ____  __    _ _____
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  / /  _  \   Javaslang
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/  \__/  /   Copyright 2014-now Daniel Dietrich
 * /___/\_/  \_/\____/\_/  \_/\__\/__/___\_/  \_//  \__/_____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Collector;

public class QueueTest extends AbstractSeqTest {

    // -- construction

    @Override
    protected <T> Collector<T, ArrayList<T>, Queue<T>> collector() {
        return Queue.collector();
    }

    @Override
    protected <T> Queue<T> empty() {
        return Queue.empty();
    }

    @Override
    protected <T> Queue<T> of(T element) {
        return Queue.of(element);
    }

    @SuppressWarnings("varargs")
    @SafeVarargs
    @Override
    protected final <T> Queue<T> ofAll(T... elements) {
        return Queue.ofAll(elements);
    }

    @Override
    protected <T> Queue<T> ofAll(java.lang.Iterable<? extends T> elements) {
        return Queue.ofAll(elements);
    }

    @Override
    protected Queue<Boolean> ofAll(boolean[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Byte> ofAll(byte[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Character> ofAll(char[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Double> ofAll(double[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Float> ofAll(float[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Integer> ofAll(int[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Long> ofAll(long[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Short> ofAll(short[] array) {
        return Queue.ofAll(array);
    }

    @Override
    protected Queue<Character> range(char from, char toExclusive) {
        return Queue.range(from, toExclusive);
    }

    @Override
    protected Queue<Character> rangeBy(char from, char toExclusive, int step) {
        return Queue.rangeBy(from, toExclusive, step);
    }

    @Override
    protected Queue<Double> rangeBy(double from, double toExclusive, double step) {
        return Queue.rangeBy(from, toExclusive, step);
    }

    @Override
    protected Queue<Integer> range(int from, int toExclusive) {
        return Queue.range(from, toExclusive);
    }

    @Override
    protected Queue<Integer> rangeBy(int from, int toExclusive, int step) {
        return Queue.rangeBy(from, toExclusive, step);
    }

    @Override
    protected Queue<Long> range(long from, long toExclusive) {
        return Queue.range(from, toExclusive);
    }

    @Override
    protected Queue<Long> rangeBy(long from, long toExclusive, long step) {
        return Queue.rangeBy(from, toExclusive, step);
    }

    @Override
    protected Queue<Character> rangeClosed(char from, char toInclusive) {
        return Queue.rangeClosed(from, toInclusive);
    }

    @Override
    protected Queue<Character> rangeClosedBy(char from, char toInclusive, int step) {
        return Queue.rangeClosedBy(from, toInclusive, step);
    }

    @Override
    protected Queue<Double> rangeClosedBy(double from, double toInclusive, double step) {
        return Queue.rangeClosedBy(from, toInclusive, step);
    }

    @Override
    protected Queue<Integer> rangeClosed(int from, int toInclusive) {
        return Queue.rangeClosed(from, toInclusive);
    }

    @Override
    protected Queue<Integer> rangeClosedBy(int from, int toInclusive, int step) {
        return Queue.rangeClosedBy(from, toInclusive, step);
    }

    @Override
    protected Queue<Long> rangeClosed(long from, long toInclusive) {
        return Queue.rangeClosed(from, toInclusive);
    }

    @Override
    protected Queue<Long> rangeClosedBy(long from, long toInclusive, long step) {
        return Queue.rangeClosedBy(from, toInclusive, step);
    }

    // -- indexOf

    private Queue<Integer> enqueued() {
        return Queue.of(1).enqueue(2, 3, 1, 5, 6);
    }

    @Test
    public void shouldNotFindIndexOfElementWhenStartIsGreaterEnc() {
        assertThat(enqueued().indexOf(2, 2)).isEqualTo(-1);
    }

    @Test
    public void shouldFindIndexOfFirstElementEnc() {
        assertThat(enqueued().indexOf(1)).isEqualTo(0);
    }

    @Test
    public void shouldFindIndexOfInnerElementEnc() {
        assertThat(enqueued().indexOf(2)).isEqualTo(1);
    }

    @Test
    public void shouldFindIndexOfLastElementEnc() {
        assertThat(enqueued().indexOf(3)).isEqualTo(2);
    }

    // -- lastIndexOf

    @Test
    public void shouldNotFindLastIndexOfElementWhenEndIdLessEnc() {
        assertThat(enqueued().lastIndexOf(3, 1)).isEqualTo(-1);
    }

    @Test
    public void shouldFindLastIndexOfElementEnc() {
        assertThat(enqueued().lastIndexOf(1)).isEqualTo(3);
    }

    @Test
    public void shouldFindLastIndexOfElementWithEndEnc() {
        assertThat(enqueued().lastIndexOf(1, 1)).isEqualTo(0);
    }
    // -- other

    @Override
    protected int getPeekNonNilPerformingAnAction() {
        return 1;
    }

    @Override
    protected boolean useIsEqualToInsteadOfIsSameAs() {
        return false;
    }

}
