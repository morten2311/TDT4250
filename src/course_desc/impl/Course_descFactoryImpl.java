/**
 */
package course_desc.impl;

import course_desc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Course_descFactoryImpl extends EFactoryImpl implements Course_descFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Course_descFactory init() {
		try {
			Course_descFactory theCourse_descFactory = (Course_descFactory)EPackage.Registry.INSTANCE.getEFactory(Course_descPackage.eNS_URI);
			if (theCourse_descFactory != null) {
				return theCourse_descFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Course_descFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_descFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Course_descPackage.COURSE: return createCourse();
			case Course_descPackage.COURSE_INSTANCE: return createCourseInstance();
			case Course_descPackage.DEPARTMENT: return createDepartment();
			case Course_descPackage.EXAM: return createExam();
			case Course_descPackage.TIMETABLE: return createTimetable();
			case Course_descPackage.PERSON: return createPerson();
			case Course_descPackage.COURSE_PRECONDITIONS: return createCoursePreconditions();
			case Course_descPackage.COURSE_WORK: return createCourseWork();
			case Course_descPackage.STUDY_PROGRAM: return createStudyProgram();
			case Course_descPackage.UNIV: return createUniv();
			case Course_descPackage.EVALUATION_WITH_DEADLINE: return createEvaluationWithDeadline();
			case Course_descPackage.STUDENT: return createStudent();
			case Course_descPackage.LECTURER: return createLecturer();
			case Course_descPackage.COURSE_COORDINATOR: return createCourseCoordinator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Course_descPackage.COURSE_WORK_TYPE:
				return createCourseWorkTypeFromString(eDataType, initialValue);
			case Course_descPackage.STUDY_PROGRAM_CODE:
				return createStudyProgramCodeFromString(eDataType, initialValue);
			case Course_descPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case Course_descPackage.DEADLINE_EVALUATION:
				return createDeadlineEvaluationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Course_descPackage.COURSE_WORK_TYPE:
				return convertCourseWorkTypeToString(eDataType, instanceValue);
			case Course_descPackage.STUDY_PROGRAM_CODE:
				return convertStudyProgramCodeToString(eDataType, instanceValue);
			case Course_descPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case Course_descPackage.DEADLINE_EVALUATION:
				return convertDeadlineEvaluationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance createCourseInstance() {
		CourseInstanceImpl courseInstance = new CourseInstanceImpl();
		return courseInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam createExam() {
		ExamImpl exam = new ExamImpl();
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable createTimetable() {
		TimetableImpl timetable = new TimetableImpl();
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePreconditions createCoursePreconditions() {
		CoursePreconditionsImpl coursePreconditions = new CoursePreconditionsImpl();
		return coursePreconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWork createCourseWork() {
		CourseWorkImpl courseWork = new CourseWorkImpl();
		return courseWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram createStudyProgram() {
		StudyProgramImpl studyProgram = new StudyProgramImpl();
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Univ createUniv() {
		UnivImpl univ = new UnivImpl();
		return univ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationWithDeadline createEvaluationWithDeadline() {
		EvaluationWithDeadlineImpl evaluationWithDeadline = new EvaluationWithDeadlineImpl();
		return evaluationWithDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lecturer createLecturer() {
		LecturerImpl lecturer = new LecturerImpl();
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseCoordinator createCourseCoordinator() {
		CourseCoordinatorImpl courseCoordinator = new CourseCoordinatorImpl();
		return courseCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWorkType createCourseWorkTypeFromString(EDataType eDataType, String initialValue) {
		CourseWorkType result = CourseWorkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseWorkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramCode createStudyProgramCodeFromString(EDataType eDataType, String initialValue) {
		StudyProgramCode result = StudyProgramCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStudyProgramCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineEvaluation createDeadlineEvaluationFromString(EDataType eDataType, String initialValue) {
		DeadlineEvaluation result = DeadlineEvaluation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeadlineEvaluationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_descPackage getCourse_descPackage() {
		return (Course_descPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Course_descPackage getPackage() {
		return Course_descPackage.eINSTANCE;
	}

} //Course_descFactoryImpl
