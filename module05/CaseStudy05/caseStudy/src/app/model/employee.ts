import {Level} from './level';
import {PositionEmployee} from './positionEmployee';

export interface Employee {
  id: number;
  name: string;
  birthday: string;
  card: string;
  phone: string;
  email: string;
  level: Level;
  positionEmployee: PositionEmployee;
  salary: number;
}
