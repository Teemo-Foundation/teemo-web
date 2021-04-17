export class User {
    constructor (
        public id?: number,
        public name?: string,
        public email?: string,
        public password?: string
        ){}
}
export class FreeTime{
    constructor(
        public id?: number,
        public day_of_week?: number,
        public hour?: number,
        public user_id?: number
    ){}
}
export class Subject{
    constructor(
        public dificulty?: number,
        public name?: string,
        public user_id?: number
    ){}
}