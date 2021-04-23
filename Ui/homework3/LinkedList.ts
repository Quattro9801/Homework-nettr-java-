import { LinkedNode } from "./LinkedNode";
export class LinkedList<T> {
    private head: LinkedNode<T> | null = null;
    private len = 0;

    constructor(headElement?: LinkedNode<T>) {
        this.head = headElement || null;
    }

    public add(elem: T): void {
        const node = new LinkedNode(elem);
        let current: LinkedNode<T>;

        if (this.head === null) {
            this.head = node;
        } else {
            current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = node;
        }
        this.len++;
    }

    public remove(pos: number): LinkedNode<T> | null {
        if (pos > -1 && pos < this.len && this.head) {
            let current = this.head;
            let previous: LinkedNode<T> = current;
            let index = 0;

            if (pos === 0) {
                this.head = current.next;
            } else {
                while (index++ < pos && current.next) {
                    previous = current;
                    current = current.next;
                }
                previous.next = current.next;
            }
              this.len--;
            return current;
        }
            return null;

    }

    public showNumber(pos: number): void{
        if (pos > -1 && pos < this.len && this.head) {
            let current = this.head;
            let previous: LinkedNode<T> = current;
            let index = 0;
                while (index++ < pos && current.next) {
                    previous = current;
                    current = current.next;
                }
            console.log("Element with number " + pos + " " + current.elem);
            }
        }

    public addPos(elem: T, pos: number): boolean {
        if (pos > -1 && pos < this.len && this.head) {
            let current = this.head;
            let index = 0;
            let previous = current;
            const node = new LinkedNode(elem);

            if (pos === 0) {
                node.next = current;
                this.head = node;
            } else {
                while (index++ < pos && current.next) {
                    previous = current;
                    current = current.next;
                }
                node.next = current;
                previous.next = node;
            }
            this.len++;
            return true;
        }
            return false;

    }

   public printAll(): void {
        let current = this.head;
        while (current != null) {
            console.log(current.elem);

            current = current.next;
        }
    }



}
