/**
 */
package course_desc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see course_desc.Course_descFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegate='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface Course_descPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "course_desc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/basic_ecore_modeling/course_description.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "course_desc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Course_descPackage eINSTANCE = course_desc.impl.Course_descPackageImpl.init();

	/**
	 * The meta object id for the '{@link course_desc.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.CourseImpl
	 * @see course_desc.impl.Course_descPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The feature id for the '<em><b>Has Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__HAS_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__HAS_PRECONDITION = 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.CourseInstanceImpl
	 * @see course_desc.impl.Course_descPackageImpl#getCourseInstance()
	 * @generated
	 */
	int COURSE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Has Timetable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__HAS_TIMETABLE = 0;

	/**
	 * The feature id for the '<em><b>Instance Of Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__INSTANCE_OF_COURSE = 1;

	/**
	 * The feature id for the '<em><b>Has Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__HAS_EVALUATIONS = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__YEAR = 3;

	/**
	 * The feature id for the '<em><b>Lecture Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__LECTURE_HOURS = 4;

	/**
	 * The feature id for the '<em><b>Lab Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__LAB_HOURS = 5;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__IS_INSTANCE_OF = 6;

	/**
	 * The feature id for the '<em><b>Has Lecturers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__HAS_LECTURERS = 7;

	/**
	 * The feature id for the '<em><b>Has Course Coordinator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__HAS_COURSE_COORDINATOR = 8;

	/**
	 * The number of structural features of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.DepartmentImpl
	 * @see course_desc.impl.Course_descPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__RESPONSIBLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__MANAGES = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.EvaluationImpl
	 * @see course_desc.impl.Course_descPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 3;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__BELONGS_TO = 1;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.ExamImpl
	 * @see course_desc.impl.Course_descPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 4;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__PERCENTAGE = EVALUATION__PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__BELONGS_TO = EVALUATION__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__DATE = EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__PLACE = EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__DURATION = EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Registered Students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__HAS_REGISTERED_STUDENTS = EVALUATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = EVALUATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.TimetableImpl
	 * @see course_desc.impl.Course_descPackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 5;

	/**
	 * The feature id for the '<em><b>Has Course Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__HAS_COURSE_WORK = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__PROGRAMS = 1;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.PersonImpl
	 * @see course_desc.impl.Course_descPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 9;

	/**
	 * The meta object id for the '{@link course_desc.impl.CoursePreconditionsImpl <em>Course Preconditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.CoursePreconditionsImpl
	 * @see course_desc.impl.Course_descPackageImpl#getCoursePreconditions()
	 * @generated
	 */
	int COURSE_PRECONDITIONS = 6;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PRECONDITIONS__IS_REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>Reduction Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PRECONDITIONS__REDUCTION_POINTS = 1;

	/**
	 * The feature id for the '<em><b>Is Recommended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PRECONDITIONS__IS_RECOMMENDED = 2;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PRECONDITIONS__BELONGS_TO = 3;

	/**
	 * The number of structural features of the '<em>Course Preconditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PRECONDITIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course Preconditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PRECONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.CourseWorkImpl <em>Course Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.CourseWorkImpl
	 * @see course_desc.impl.Course_descPackageImpl#getCourseWork()
	 * @generated
	 */
	int COURSE_WORK = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__IS_MANDATORY = 2;

	/**
	 * The feature id for the '<em><b>Is Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__IS_RESTRICTED = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Course Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.StudyProgramImpl <em>Study Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.StudyProgramImpl
	 * @see course_desc.impl.Course_descPackageImpl#getStudyProgram()
	 * @generated
	 */
	int STUDY_PROGRAM = 8;

	/**
	 * The feature id for the '<em><b>Study Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__STUDY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__OFFERS = 1;

	/**
	 * The feature id for the '<em><b>Belongs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__BELONGS = 2;

	/**
	 * The number of structural features of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Person Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_NR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Has Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HAS_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 4;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.PersonRoleImpl <em>Person Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.PersonRoleImpl
	 * @see course_desc.impl.Course_descPackageImpl#getPersonRole()
	 * @generated
	 */
	int PERSON_ROLE = 10;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__LINKED_TO = 0;

	/**
	 * The number of structural features of the '<em>Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.UnivImpl <em>Univ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.UnivImpl
	 * @see course_desc.impl.Course_descPackageImpl#getUniv()
	 * @generated
	 */
	int UNIV = 14;

	/**
	 * The meta object id for the '{@link course_desc.impl.EvaluationWithDeadlineImpl <em>Evaluation With Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.EvaluationWithDeadlineImpl
	 * @see course_desc.impl.Course_descPackageImpl#getEvaluationWithDeadline()
	 * @generated
	 */
	int EVALUATION_WITH_DEADLINE = 15;

	/**
	 * The meta object id for the '{@link course_desc.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.StudentImpl
	 * @see course_desc.impl.Course_descPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 11;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__LINKED_TO = PERSON_ROLE__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Has Exams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__HAS_EXAMS = PERSON_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finished Exams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FINISHED_EXAMS = PERSON_ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Study Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__TOTAL_STUDY_POINTS = PERSON_ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = PERSON_ROLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Sign Up For Exam</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___SIGN_UP_FOR_EXAM__EXAM = PERSON_ROLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cancel Exam</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___CANCEL_EXAM__EXAM = PERSON_ROLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Take Exam</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___TAKE_EXAM__EXAM = PERSON_ROLE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = PERSON_ROLE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link course_desc.impl.LecturerImpl <em>Lecturer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.LecturerImpl
	 * @see course_desc.impl.Course_descPackageImpl#getLecturer()
	 * @generated
	 */
	int LECTURER = 12;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER__LINKED_TO = PERSON_ROLE__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER__BELONGS_TO = PERSON_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lecturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER_FEATURE_COUNT = PERSON_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lecturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER_OPERATION_COUNT = PERSON_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link course_desc.impl.CourseCoordinatorImpl <em>Course Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.impl.CourseCoordinatorImpl
	 * @see course_desc.impl.Course_descPackageImpl#getCourseCoordinator()
	 * @generated
	 */
	int COURSE_COORDINATOR = 13;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COORDINATOR__LINKED_TO = PERSON_ROLE__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COORDINATOR__BELONGS_TO = PERSON_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Course Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COORDINATOR_FEATURE_COUNT = PERSON_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Course Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COORDINATOR_OPERATION_COUNT = PERSON_ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIV__HAS_DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIV__HAS_COURSES = 1;

	/**
	 * The feature id for the '<em><b>Has Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIV__HAS_PERSONS = 2;

	/**
	 * The feature id for the '<em><b>Has Precond</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIV__HAS_PRECOND = 3;

	/**
	 * The feature id for the '<em><b>Has Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIV__HAS_STUDENTS = 4;

	/**
	 * The number of structural features of the '<em>Univ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIV_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Univ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIV_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_WITH_DEADLINE__PERCENTAGE = EVALUATION__PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_WITH_DEADLINE__BELONGS_TO = EVALUATION__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Deadline Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION = EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluation With Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_WITH_DEADLINE_FEATURE_COUNT = EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evaluation With Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_WITH_DEADLINE_OPERATION_COUNT = EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link course_desc.CourseWorkType <em>Course Work Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.CourseWorkType
	 * @see course_desc.impl.Course_descPackageImpl#getCourseWorkType()
	 * @generated
	 */
	int COURSE_WORK_TYPE = 16;

	/**
	 * The meta object id for the '{@link course_desc.StudyProgramCode <em>Study Program Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.StudyProgramCode
	 * @see course_desc.impl.Course_descPackageImpl#getStudyProgramCode()
	 * @generated
	 */
	int STUDY_PROGRAM_CODE = 17;

	/**
	 * The meta object id for the '{@link course_desc.DeadlineEvaluation <em>Deadline Evaluation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course_desc.DeadlineEvaluation
	 * @see course_desc.impl.Course_descPackageImpl#getDeadlineEvaluation()
	 * @generated
	 */
	int DEADLINE_EVALUATION = 18;


	/**
	 * Returns the meta object for class '{@link course_desc.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see course_desc.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see course_desc.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course_desc.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Course#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see course_desc.Course#getContent()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Content();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see course_desc.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.Course#getHasInstance <em>Has Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Instance</em>'.
	 * @see course_desc.Course#getHasInstance()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_HasInstance();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.Course#getHasPrecondition <em>Has Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Precondition</em>'.
	 * @see course_desc.Course#getHasPrecondition()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_HasPrecondition();

	/**
	 * Returns the meta object for class '{@link course_desc.CourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Instance</em>'.
	 * @see course_desc.CourseInstance
	 * @generated
	 */
	EClass getCourseInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.CourseInstance#getHasTimetable <em>Has Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Timetable</em>'.
	 * @see course_desc.CourseInstance#getHasTimetable()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_HasTimetable();

	/**
	 * Returns the meta object for the reference '{@link course_desc.CourseInstance#getInstanceOfCourse <em>Instance Of Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of Course</em>'.
	 * @see course_desc.CourseInstance#getInstanceOfCourse()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_InstanceOfCourse();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.CourseInstance#getHasEvaluations <em>Has Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Evaluations</em>'.
	 * @see course_desc.CourseInstance#getHasEvaluations()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_HasEvaluations();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseInstance#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see course_desc.CourseInstance#getYear()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_Year();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseInstance#getLectureHours <em>Lecture Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lecture Hours</em>'.
	 * @see course_desc.CourseInstance#getLectureHours()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_LectureHours();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseInstance#getLabHours <em>Lab Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lab Hours</em>'.
	 * @see course_desc.CourseInstance#getLabHours()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_LabHours();

	/**
	 * Returns the meta object for the container reference '{@link course_desc.CourseInstance#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Instance Of</em>'.
	 * @see course_desc.CourseInstance#getIsInstanceOf()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_IsInstanceOf();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.CourseInstance#getHasLecturers <em>Has Lecturers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Lecturers</em>'.
	 * @see course_desc.CourseInstance#getHasLecturers()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_HasLecturers();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.CourseInstance#getHasCourseCoordinator <em>Has Course Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Course Coordinator</em>'.
	 * @see course_desc.CourseInstance#getHasCourseCoordinator()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_HasCourseCoordinator();

	/**
	 * Returns the meta object for class '{@link course_desc.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see course_desc.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Department#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible</em>'.
	 * @see course_desc.Department#getResponsible()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course_desc.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Department#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manages</em>'.
	 * @see course_desc.Department#getManages()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Manages();

	/**
	 * Returns the meta object for class '{@link course_desc.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see course_desc.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Exam#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see course_desc.Exam#getDate()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Date();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Exam#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see course_desc.Exam#getPlace()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Place();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Exam#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see course_desc.Exam#getDuration()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Duration();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.Exam#getHasRegisteredStudents <em>Has Registered Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Registered Students</em>'.
	 * @see course_desc.Exam#getHasRegisteredStudents()
	 * @see #getExam()
	 * @generated
	 */
	EReference getExam_HasRegisteredStudents();

	/**
	 * Returns the meta object for class '{@link course_desc.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see course_desc.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Timetable#getHasCourseWork <em>Has Course Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Course Work</em>'.
	 * @see course_desc.Timetable#getHasCourseWork()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_HasCourseWork();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.Timetable#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Programs</em>'.
	 * @see course_desc.Timetable#getPrograms()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_Programs();

	/**
	 * Returns the meta object for class '{@link course_desc.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see course_desc.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Person#getPersonNr <em>Person Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Nr</em>'.
	 * @see course_desc.Person#getPersonNr()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonNr();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course_desc.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.Person#getHasRole <em>Has Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Role</em>'.
	 * @see course_desc.Person#getHasRole()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_HasRole();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Person#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see course_desc.Person#getFullName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FullName();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see course_desc.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for class '{@link course_desc.CoursePreconditions <em>Course Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Preconditions</em>'.
	 * @see course_desc.CoursePreconditions
	 * @generated
	 */
	EClass getCoursePreconditions();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CoursePreconditions#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see course_desc.CoursePreconditions#isIsRequired()
	 * @see #getCoursePreconditions()
	 * @generated
	 */
	EAttribute getCoursePreconditions_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CoursePreconditions#getReductionPoints <em>Reduction Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reduction Points</em>'.
	 * @see course_desc.CoursePreconditions#getReductionPoints()
	 * @see #getCoursePreconditions()
	 * @generated
	 */
	EAttribute getCoursePreconditions_ReductionPoints();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CoursePreconditions#isIsRecommended <em>Is Recommended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Recommended</em>'.
	 * @see course_desc.CoursePreconditions#isIsRecommended()
	 * @see #getCoursePreconditions()
	 * @generated
	 */
	EAttribute getCoursePreconditions_IsRecommended();

	/**
	 * Returns the meta object for the reference '{@link course_desc.CoursePreconditions#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see course_desc.CoursePreconditions#getBelongsTo()
	 * @see #getCoursePreconditions()
	 * @generated
	 */
	EReference getCoursePreconditions_BelongsTo();

	/**
	 * Returns the meta object for class '{@link course_desc.CourseWork <em>Course Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Work</em>'.
	 * @see course_desc.CourseWork
	 * @generated
	 */
	EClass getCourseWork();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseWork#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see course_desc.CourseWork#getDuration()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_Duration();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseWork#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see course_desc.CourseWork#getRoom()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_Room();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseWork#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see course_desc.CourseWork#isIsMandatory()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_IsMandatory();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseWork#isIsRestricted <em>Is Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Restricted</em>'.
	 * @see course_desc.CourseWork#isIsRestricted()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_IsRestricted();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.CourseWork#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see course_desc.CourseWork#getType()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_Type();

	/**
	 * Returns the meta object for class '{@link course_desc.StudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Program</em>'.
	 * @see course_desc.StudyProgram
	 * @generated
	 */
	EClass getStudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.StudyProgram#getStudyCode <em>Study Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Code</em>'.
	 * @see course_desc.StudyProgram#getStudyCode()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_StudyCode();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.StudyProgram#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offers</em>'.
	 * @see course_desc.StudyProgram#getOffers()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Offers();

	/**
	 * Returns the meta object for the container reference '{@link course_desc.StudyProgram#getBelongs <em>Belongs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs</em>'.
	 * @see course_desc.StudyProgram#getBelongs()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Belongs();

	/**
	 * Returns the meta object for class '{@link course_desc.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see course_desc.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Evaluation#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see course_desc.Evaluation#getPercentage()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Percentage();

	/**
	 * Returns the meta object for the container reference '{@link course_desc.Evaluation#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To</em>'.
	 * @see course_desc.Evaluation#getBelongsTo()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_BelongsTo();

	/**
	 * Returns the meta object for class '{@link course_desc.PersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Role</em>'.
	 * @see course_desc.PersonRole
	 * @generated
	 */
	EClass getPersonRole();

	/**
	 * Returns the meta object for the reference '{@link course_desc.PersonRole#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked To</em>'.
	 * @see course_desc.PersonRole#getLinkedTo()
	 * @see #getPersonRole()
	 * @generated
	 */
	EReference getPersonRole_LinkedTo();

	/**
	 * Returns the meta object for class '{@link course_desc.Univ <em>Univ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Univ</em>'.
	 * @see course_desc.Univ
	 * @generated
	 */
	EClass getUniv();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Univ#getHasDepartment <em>Has Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Department</em>'.
	 * @see course_desc.Univ#getHasDepartment()
	 * @see #getUniv()
	 * @generated
	 */
	EReference getUniv_HasDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Univ#getHasCourses <em>Has Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Courses</em>'.
	 * @see course_desc.Univ#getHasCourses()
	 * @see #getUniv()
	 * @generated
	 */
	EReference getUniv_HasCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Univ#getHasPersons <em>Has Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Persons</em>'.
	 * @see course_desc.Univ#getHasPersons()
	 * @see #getUniv()
	 * @generated
	 */
	EReference getUniv_HasPersons();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Univ#getHasPrecond <em>Has Precond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Precond</em>'.
	 * @see course_desc.Univ#getHasPrecond()
	 * @see #getUniv()
	 * @generated
	 */
	EReference getUniv_HasPrecond();

	/**
	 * Returns the meta object for the containment reference list '{@link course_desc.Univ#getHasStudents <em>Has Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Students</em>'.
	 * @see course_desc.Univ#getHasStudents()
	 * @see #getUniv()
	 * @generated
	 */
	EReference getUniv_HasStudents();

	/**
	 * Returns the meta object for class '{@link course_desc.EvaluationWithDeadline <em>Evaluation With Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation With Deadline</em>'.
	 * @see course_desc.EvaluationWithDeadline
	 * @generated
	 */
	EClass getEvaluationWithDeadline();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.EvaluationWithDeadline#getDeadlineEvaluation <em>Deadline Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline Evaluation</em>'.
	 * @see course_desc.EvaluationWithDeadline#getDeadlineEvaluation()
	 * @see #getEvaluationWithDeadline()
	 * @generated
	 */
	EAttribute getEvaluationWithDeadline_DeadlineEvaluation();

	/**
	 * Returns the meta object for class '{@link course_desc.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see course_desc.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.Student#getHasExams <em>Has Exams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Exams</em>'.
	 * @see course_desc.Student#getHasExams()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_HasExams();

	/**
	 * Returns the meta object for the reference list '{@link course_desc.Student#getFinishedExams <em>Finished Exams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finished Exams</em>'.
	 * @see course_desc.Student#getFinishedExams()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_FinishedExams();

	/**
	 * Returns the meta object for the attribute '{@link course_desc.Student#getTotalStudyPoints <em>Total Study Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Study Points</em>'.
	 * @see course_desc.Student#getTotalStudyPoints()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_TotalStudyPoints();

	/**
	 * Returns the meta object for the '{@link course_desc.Student#signUpForExam(course_desc.Exam) <em>Sign Up For Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sign Up For Exam</em>' operation.
	 * @see course_desc.Student#signUpForExam(course_desc.Exam)
	 * @generated
	 */
	EOperation getStudent__SignUpForExam__Exam();

	/**
	 * Returns the meta object for the '{@link course_desc.Student#cancelExam(course_desc.Exam) <em>Cancel Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Exam</em>' operation.
	 * @see course_desc.Student#cancelExam(course_desc.Exam)
	 * @generated
	 */
	EOperation getStudent__CancelExam__Exam();

	/**
	 * Returns the meta object for the '{@link course_desc.Student#takeExam(course_desc.Exam) <em>Take Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Exam</em>' operation.
	 * @see course_desc.Student#takeExam(course_desc.Exam)
	 * @generated
	 */
	EOperation getStudent__TakeExam__Exam();

	/**
	 * Returns the meta object for class '{@link course_desc.Lecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecturer</em>'.
	 * @see course_desc.Lecturer
	 * @generated
	 */
	EClass getLecturer();

	/**
	 * Returns the meta object for the reference '{@link course_desc.Lecturer#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see course_desc.Lecturer#getBelongsTo()
	 * @see #getLecturer()
	 * @generated
	 */
	EReference getLecturer_BelongsTo();

	/**
	 * Returns the meta object for class '{@link course_desc.CourseCoordinator <em>Course Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Coordinator</em>'.
	 * @see course_desc.CourseCoordinator
	 * @generated
	 */
	EClass getCourseCoordinator();

	/**
	 * Returns the meta object for the reference '{@link course_desc.CourseCoordinator#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see course_desc.CourseCoordinator#getBelongsTo()
	 * @see #getCourseCoordinator()
	 * @generated
	 */
	EReference getCourseCoordinator_BelongsTo();

	/**
	 * Returns the meta object for enum '{@link course_desc.CourseWorkType <em>Course Work Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Work Type</em>'.
	 * @see course_desc.CourseWorkType
	 * @generated
	 */
	EEnum getCourseWorkType();

	/**
	 * Returns the meta object for enum '{@link course_desc.StudyProgramCode <em>Study Program Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Study Program Code</em>'.
	 * @see course_desc.StudyProgramCode
	 * @generated
	 */
	EEnum getStudyProgramCode();

	/**
	 * Returns the meta object for enum '{@link course_desc.DeadlineEvaluation <em>Deadline Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deadline Evaluation</em>'.
	 * @see course_desc.DeadlineEvaluation
	 * @generated
	 */
	EEnum getDeadlineEvaluation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Course_descFactory getCourse_descFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link course_desc.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.CourseImpl
		 * @see course_desc.impl.Course_descPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CONTENT = eINSTANCE.getCourse_Content();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Has Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__HAS_INSTANCE = eINSTANCE.getCourse_HasInstance();

		/**
		 * The meta object literal for the '<em><b>Has Precondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__HAS_PRECONDITION = eINSTANCE.getCourse_HasPrecondition();

		/**
		 * The meta object literal for the '{@link course_desc.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.CourseInstanceImpl
		 * @see course_desc.impl.Course_descPackageImpl#getCourseInstance()
		 * @generated
		 */
		EClass COURSE_INSTANCE = eINSTANCE.getCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Has Timetable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__HAS_TIMETABLE = eINSTANCE.getCourseInstance_HasTimetable();

		/**
		 * The meta object literal for the '<em><b>Instance Of Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__INSTANCE_OF_COURSE = eINSTANCE.getCourseInstance_InstanceOfCourse();

		/**
		 * The meta object literal for the '<em><b>Has Evaluations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__HAS_EVALUATIONS = eINSTANCE.getCourseInstance_HasEvaluations();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__YEAR = eINSTANCE.getCourseInstance_Year();

		/**
		 * The meta object literal for the '<em><b>Lecture Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__LECTURE_HOURS = eINSTANCE.getCourseInstance_LectureHours();

		/**
		 * The meta object literal for the '<em><b>Lab Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__LAB_HOURS = eINSTANCE.getCourseInstance_LabHours();

		/**
		 * The meta object literal for the '<em><b>Is Instance Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__IS_INSTANCE_OF = eINSTANCE.getCourseInstance_IsInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Has Lecturers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__HAS_LECTURERS = eINSTANCE.getCourseInstance_HasLecturers();

		/**
		 * The meta object literal for the '<em><b>Has Course Coordinator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__HAS_COURSE_COORDINATOR = eINSTANCE.getCourseInstance_HasCourseCoordinator();

		/**
		 * The meta object literal for the '{@link course_desc.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.DepartmentImpl
		 * @see course_desc.impl.Course_descPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__RESPONSIBLE = eINSTANCE.getDepartment_Responsible();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__MANAGES = eINSTANCE.getDepartment_Manages();

		/**
		 * The meta object literal for the '{@link course_desc.impl.ExamImpl <em>Exam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.ExamImpl
		 * @see course_desc.impl.Course_descPackageImpl#getExam()
		 * @generated
		 */
		EClass EXAM = eINSTANCE.getExam();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__DATE = eINSTANCE.getExam_Date();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__PLACE = eINSTANCE.getExam_Place();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__DURATION = eINSTANCE.getExam_Duration();

		/**
		 * The meta object literal for the '<em><b>Has Registered Students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM__HAS_REGISTERED_STUDENTS = eINSTANCE.getExam_HasRegisteredStudents();

		/**
		 * The meta object literal for the '{@link course_desc.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.TimetableImpl
		 * @see course_desc.impl.Course_descPackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();

		/**
		 * The meta object literal for the '<em><b>Has Course Work</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__HAS_COURSE_WORK = eINSTANCE.getTimetable_HasCourseWork();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__PROGRAMS = eINSTANCE.getTimetable_Programs();

		/**
		 * The meta object literal for the '{@link course_desc.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.PersonImpl
		 * @see course_desc.impl.Course_descPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Person Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_NR = eINSTANCE.getPerson_PersonNr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Has Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__HAS_ROLE = eINSTANCE.getPerson_HasRole();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULL_NAME = eINSTANCE.getPerson_FullName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '{@link course_desc.impl.CoursePreconditionsImpl <em>Course Preconditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.CoursePreconditionsImpl
		 * @see course_desc.impl.Course_descPackageImpl#getCoursePreconditions()
		 * @generated
		 */
		EClass COURSE_PRECONDITIONS = eINSTANCE.getCoursePreconditions();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_PRECONDITIONS__IS_REQUIRED = eINSTANCE.getCoursePreconditions_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Reduction Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_PRECONDITIONS__REDUCTION_POINTS = eINSTANCE.getCoursePreconditions_ReductionPoints();

		/**
		 * The meta object literal for the '<em><b>Is Recommended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_PRECONDITIONS__IS_RECOMMENDED = eINSTANCE.getCoursePreconditions_IsRecommended();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_PRECONDITIONS__BELONGS_TO = eINSTANCE.getCoursePreconditions_BelongsTo();

		/**
		 * The meta object literal for the '{@link course_desc.impl.CourseWorkImpl <em>Course Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.CourseWorkImpl
		 * @see course_desc.impl.Course_descPackageImpl#getCourseWork()
		 * @generated
		 */
		EClass COURSE_WORK = eINSTANCE.getCourseWork();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__DURATION = eINSTANCE.getCourseWork_Duration();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__ROOM = eINSTANCE.getCourseWork_Room();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__IS_MANDATORY = eINSTANCE.getCourseWork_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Restricted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__IS_RESTRICTED = eINSTANCE.getCourseWork_IsRestricted();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__TYPE = eINSTANCE.getCourseWork_Type();

		/**
		 * The meta object literal for the '{@link course_desc.impl.StudyProgramImpl <em>Study Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.StudyProgramImpl
		 * @see course_desc.impl.Course_descPackageImpl#getStudyProgram()
		 * @generated
		 */
		EClass STUDY_PROGRAM = eINSTANCE.getStudyProgram();

		/**
		 * The meta object literal for the '<em><b>Study Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__STUDY_CODE = eINSTANCE.getStudyProgram_StudyCode();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__OFFERS = eINSTANCE.getStudyProgram_Offers();

		/**
		 * The meta object literal for the '<em><b>Belongs</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__BELONGS = eINSTANCE.getStudyProgram_Belongs();

		/**
		 * The meta object literal for the '{@link course_desc.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.EvaluationImpl
		 * @see course_desc.impl.Course_descPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__PERCENTAGE = eINSTANCE.getEvaluation_Percentage();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__BELONGS_TO = eINSTANCE.getEvaluation_BelongsTo();

		/**
		 * The meta object literal for the '{@link course_desc.impl.PersonRoleImpl <em>Person Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.PersonRoleImpl
		 * @see course_desc.impl.Course_descPackageImpl#getPersonRole()
		 * @generated
		 */
		EClass PERSON_ROLE = eINSTANCE.getPersonRole();

		/**
		 * The meta object literal for the '<em><b>Linked To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_ROLE__LINKED_TO = eINSTANCE.getPersonRole_LinkedTo();

		/**
		 * The meta object literal for the '{@link course_desc.impl.UnivImpl <em>Univ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.UnivImpl
		 * @see course_desc.impl.Course_descPackageImpl#getUniv()
		 * @generated
		 */
		EClass UNIV = eINSTANCE.getUniv();

		/**
		 * The meta object literal for the '<em><b>Has Department</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIV__HAS_DEPARTMENT = eINSTANCE.getUniv_HasDepartment();

		/**
		 * The meta object literal for the '<em><b>Has Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIV__HAS_COURSES = eINSTANCE.getUniv_HasCourses();

		/**
		 * The meta object literal for the '<em><b>Has Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIV__HAS_PERSONS = eINSTANCE.getUniv_HasPersons();

		/**
		 * The meta object literal for the '<em><b>Has Precond</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIV__HAS_PRECOND = eINSTANCE.getUniv_HasPrecond();

		/**
		 * The meta object literal for the '<em><b>Has Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIV__HAS_STUDENTS = eINSTANCE.getUniv_HasStudents();

		/**
		 * The meta object literal for the '{@link course_desc.impl.EvaluationWithDeadlineImpl <em>Evaluation With Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.EvaluationWithDeadlineImpl
		 * @see course_desc.impl.Course_descPackageImpl#getEvaluationWithDeadline()
		 * @generated
		 */
		EClass EVALUATION_WITH_DEADLINE = eINSTANCE.getEvaluationWithDeadline();

		/**
		 * The meta object literal for the '<em><b>Deadline Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION = eINSTANCE.getEvaluationWithDeadline_DeadlineEvaluation();

		/**
		 * The meta object literal for the '{@link course_desc.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.StudentImpl
		 * @see course_desc.impl.Course_descPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Has Exams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__HAS_EXAMS = eINSTANCE.getStudent_HasExams();

		/**
		 * The meta object literal for the '<em><b>Finished Exams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__FINISHED_EXAMS = eINSTANCE.getStudent_FinishedExams();

		/**
		 * The meta object literal for the '<em><b>Total Study Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__TOTAL_STUDY_POINTS = eINSTANCE.getStudent_TotalStudyPoints();

		/**
		 * The meta object literal for the '<em><b>Sign Up For Exam</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___SIGN_UP_FOR_EXAM__EXAM = eINSTANCE.getStudent__SignUpForExam__Exam();

		/**
		 * The meta object literal for the '<em><b>Cancel Exam</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___CANCEL_EXAM__EXAM = eINSTANCE.getStudent__CancelExam__Exam();

		/**
		 * The meta object literal for the '<em><b>Take Exam</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___TAKE_EXAM__EXAM = eINSTANCE.getStudent__TakeExam__Exam();

		/**
		 * The meta object literal for the '{@link course_desc.impl.LecturerImpl <em>Lecturer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.LecturerImpl
		 * @see course_desc.impl.Course_descPackageImpl#getLecturer()
		 * @generated
		 */
		EClass LECTURER = eINSTANCE.getLecturer();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURER__BELONGS_TO = eINSTANCE.getLecturer_BelongsTo();

		/**
		 * The meta object literal for the '{@link course_desc.impl.CourseCoordinatorImpl <em>Course Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.impl.CourseCoordinatorImpl
		 * @see course_desc.impl.Course_descPackageImpl#getCourseCoordinator()
		 * @generated
		 */
		EClass COURSE_COORDINATOR = eINSTANCE.getCourseCoordinator();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_COORDINATOR__BELONGS_TO = eINSTANCE.getCourseCoordinator_BelongsTo();

		/**
		 * The meta object literal for the '{@link course_desc.CourseWorkType <em>Course Work Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.CourseWorkType
		 * @see course_desc.impl.Course_descPackageImpl#getCourseWorkType()
		 * @generated
		 */
		EEnum COURSE_WORK_TYPE = eINSTANCE.getCourseWorkType();

		/**
		 * The meta object literal for the '{@link course_desc.StudyProgramCode <em>Study Program Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.StudyProgramCode
		 * @see course_desc.impl.Course_descPackageImpl#getStudyProgramCode()
		 * @generated
		 */
		EEnum STUDY_PROGRAM_CODE = eINSTANCE.getStudyProgramCode();

		/**
		 * The meta object literal for the '{@link course_desc.DeadlineEvaluation <em>Deadline Evaluation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course_desc.DeadlineEvaluation
		 * @see course_desc.impl.Course_descPackageImpl#getDeadlineEvaluation()
		 * @generated
		 */
		EEnum DEADLINE_EVALUATION = eINSTANCE.getDeadlineEvaluation();

	}

} //Course_descPackage
