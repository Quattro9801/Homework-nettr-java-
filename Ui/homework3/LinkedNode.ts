export class LinkedNode <T> {
    private _elem: T;
    public next: LinkedNode<T> | null;

    constructor(elem: T) {
        this._elem = elem;
        this.next = null;
    }

   get elem(): T {
        return this._elem;
    }
}
