
import { Component, OnChanges, Input } from '@angular/core';

@Component({
    selector: 'app-star',
    templateUrl: './star.component.html',
})
export class StarComponent implements OnChanges {

    @Input()
    rating: number = 0;

    starWidth: number | undefined ;

    ngOnChanges(): void {
        this.starWidth = this.rating * 74 / 5;
    }

}
