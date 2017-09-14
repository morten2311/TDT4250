/**
 */
package course_desc.impl;

import course_desc.Course;
import course_desc.CourseInstance;
import course_desc.Course_descPackage;
import course_desc.Department;
import course_desc.Evaluation;
import course_desc.PersonRole;
import course_desc.Timetable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getHasTimetable <em>Has Timetable</em>}</li>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getInstanceOfCourse <em>Instance Of Course</em>}</li>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getHasEvaluations <em>Has Evaluations</em>}</li>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getYear <em>Year</em>}</li>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getLectureHours <em>Lecture Hours</em>}</li>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getLabHours <em>Lab Hours</em>}</li>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link course_desc.impl.CourseInstanceImpl#getHasPersonRole <em>Has Person Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInstanceImpl extends MinimalEObjectImpl.Container implements CourseInstance {
	/**
	 * The cached value of the '{@link #getHasTimetable() <em>Has Timetable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTimetable()
	 * @generated
	 * @ordered
	 */
	protected EList<Timetable> hasTimetable;

	/**
	 * The cached value of the '{@link #getInstanceOfCourse() <em>Instance Of Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfCourse()
	 * @generated
	 * @ordered
	 */
	protected Course instanceOfCourse;

	/**
	 * The cached value of the '{@link #getHasEvaluations() <em>Has Evaluations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEvaluations()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation> hasEvaluations;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLectureHours() <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHours()
	 * @generated
	 * @ordered
	 */
	protected static final double LECTURE_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLectureHours() <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHours()
	 * @generated
	 * @ordered
	 */
	protected double lectureHours = LECTURE_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabHours() <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabHours()
	 * @generated
	 * @ordered
	 */
	protected static final double LAB_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLabHours() <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabHours()
	 * @generated
	 * @ordered
	 */
	protected double labHours = LAB_HOURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasPersonRole() <em>Has Person Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersonRole()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonRole> hasPersonRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.COURSE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timetable> getHasTimetable() {
		if (hasTimetable == null) {
			hasTimetable = new EObjectContainmentEList<Timetable>(Timetable.class, this, Course_descPackage.COURSE_INSTANCE__HAS_TIMETABLE);
		}
		return hasTimetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getInstanceOfCourse() {
		if (instanceOfCourse != null && instanceOfCourse.eIsProxy()) {
			InternalEObject oldInstanceOfCourse = (InternalEObject)instanceOfCourse;
			instanceOfCourse = (Course)eResolveProxy(oldInstanceOfCourse);
			if (instanceOfCourse != oldInstanceOfCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE, oldInstanceOfCourse, instanceOfCourse));
			}
		}
		return instanceOfCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetInstanceOfCourse() {
		return instanceOfCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceOfCourse(Course newInstanceOfCourse, NotificationChain msgs) {
		Course oldInstanceOfCourse = instanceOfCourse;
		instanceOfCourse = newInstanceOfCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE, oldInstanceOfCourse, newInstanceOfCourse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOfCourse(Course newInstanceOfCourse) {
		if (newInstanceOfCourse != instanceOfCourse) {
			NotificationChain msgs = null;
			if (instanceOfCourse != null)
				msgs = ((InternalEObject)instanceOfCourse).eInverseRemove(this, Course_descPackage.COURSE__HAS_INSTANCE, Course.class, msgs);
			if (newInstanceOfCourse != null)
				msgs = ((InternalEObject)newInstanceOfCourse).eInverseAdd(this, Course_descPackage.COURSE__HAS_INSTANCE, Course.class, msgs);
			msgs = basicSetInstanceOfCourse(newInstanceOfCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE, newInstanceOfCourse, newInstanceOfCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation> getHasEvaluations() {
		if (hasEvaluations == null) {
			hasEvaluations = new EObjectContainmentWithInverseEList<Evaluation>(Evaluation.class, this, Course_descPackage.COURSE_INSTANCE__HAS_EVALUATIONS, Course_descPackage.EVALUATION__BELONGS_TO);
		}
		return hasEvaluations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_INSTANCE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLectureHours() {
		return lectureHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLectureHours(double newLectureHours) {
		double oldLectureHours = lectureHours;
		lectureHours = newLectureHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_INSTANCE__LECTURE_HOURS, oldLectureHours, lectureHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLabHours() {
		return labHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabHours(double newLabHours) {
		double oldLabHours = labHours;
		labHours = newLabHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_INSTANCE__LAB_HOURS, oldLabHours, labHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getIsInstanceOf() {
		if (eContainerFeatureID() != Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInstanceOf(Department newIsInstanceOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsInstanceOf, Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInstanceOf(Department newIsInstanceOf) {
		if (newIsInstanceOf != eInternalContainer() || (eContainerFeatureID() != Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF && newIsInstanceOf != null)) {
			if (EcoreUtil.isAncestor(this, newIsInstanceOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsInstanceOf != null)
				msgs = ((InternalEObject)newIsInstanceOf).eInverseAdd(this, Course_descPackage.DEPARTMENT__RESPONSIBLE, Department.class, msgs);
			msgs = basicSetIsInstanceOf(newIsInstanceOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF, newIsInstanceOf, newIsInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonRole> getHasPersonRole() {
		if (hasPersonRole == null) {
			hasPersonRole = new EObjectContainmentWithInverseEList<PersonRole>(PersonRole.class, this, Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE, Course_descPackage.PERSON_ROLE__BELONGS_TO);
		}
		return hasPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE:
				if (instanceOfCourse != null)
					msgs = ((InternalEObject)instanceOfCourse).eInverseRemove(this, Course_descPackage.COURSE__HAS_INSTANCE, Course.class, msgs);
				return basicSetInstanceOfCourse((Course)otherEnd, msgs);
			case Course_descPackage.COURSE_INSTANCE__HAS_EVALUATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasEvaluations()).basicAdd(otherEnd, msgs);
			case Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsInstanceOf((Department)otherEnd, msgs);
			case Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasPersonRole()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.COURSE_INSTANCE__HAS_TIMETABLE:
				return ((InternalEList<?>)getHasTimetable()).basicRemove(otherEnd, msgs);
			case Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE:
				return basicSetInstanceOfCourse(null, msgs);
			case Course_descPackage.COURSE_INSTANCE__HAS_EVALUATIONS:
				return ((InternalEList<?>)getHasEvaluations()).basicRemove(otherEnd, msgs);
			case Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF:
				return basicSetIsInstanceOf(null, msgs);
			case Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE:
				return ((InternalEList<?>)getHasPersonRole()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF:
				return eInternalContainer().eInverseRemove(this, Course_descPackage.DEPARTMENT__RESPONSIBLE, Department.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.COURSE_INSTANCE__HAS_TIMETABLE:
				return getHasTimetable();
			case Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE:
				if (resolve) return getInstanceOfCourse();
				return basicGetInstanceOfCourse();
			case Course_descPackage.COURSE_INSTANCE__HAS_EVALUATIONS:
				return getHasEvaluations();
			case Course_descPackage.COURSE_INSTANCE__YEAR:
				return getYear();
			case Course_descPackage.COURSE_INSTANCE__LECTURE_HOURS:
				return getLectureHours();
			case Course_descPackage.COURSE_INSTANCE__LAB_HOURS:
				return getLabHours();
			case Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF:
				return getIsInstanceOf();
			case Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE:
				return getHasPersonRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.COURSE_INSTANCE__HAS_TIMETABLE:
				getHasTimetable().clear();
				getHasTimetable().addAll((Collection<? extends Timetable>)newValue);
				return;
			case Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE:
				setInstanceOfCourse((Course)newValue);
				return;
			case Course_descPackage.COURSE_INSTANCE__HAS_EVALUATIONS:
				getHasEvaluations().clear();
				getHasEvaluations().addAll((Collection<? extends Evaluation>)newValue);
				return;
			case Course_descPackage.COURSE_INSTANCE__YEAR:
				setYear((Integer)newValue);
				return;
			case Course_descPackage.COURSE_INSTANCE__LECTURE_HOURS:
				setLectureHours((Double)newValue);
				return;
			case Course_descPackage.COURSE_INSTANCE__LAB_HOURS:
				setLabHours((Double)newValue);
				return;
			case Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF:
				setIsInstanceOf((Department)newValue);
				return;
			case Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE:
				getHasPersonRole().clear();
				getHasPersonRole().addAll((Collection<? extends PersonRole>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.COURSE_INSTANCE__HAS_TIMETABLE:
				getHasTimetable().clear();
				return;
			case Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE:
				setInstanceOfCourse((Course)null);
				return;
			case Course_descPackage.COURSE_INSTANCE__HAS_EVALUATIONS:
				getHasEvaluations().clear();
				return;
			case Course_descPackage.COURSE_INSTANCE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case Course_descPackage.COURSE_INSTANCE__LECTURE_HOURS:
				setLectureHours(LECTURE_HOURS_EDEFAULT);
				return;
			case Course_descPackage.COURSE_INSTANCE__LAB_HOURS:
				setLabHours(LAB_HOURS_EDEFAULT);
				return;
			case Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF:
				setIsInstanceOf((Department)null);
				return;
			case Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE:
				getHasPersonRole().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.COURSE_INSTANCE__HAS_TIMETABLE:
				return hasTimetable != null && !hasTimetable.isEmpty();
			case Course_descPackage.COURSE_INSTANCE__INSTANCE_OF_COURSE:
				return instanceOfCourse != null;
			case Course_descPackage.COURSE_INSTANCE__HAS_EVALUATIONS:
				return hasEvaluations != null && !hasEvaluations.isEmpty();
			case Course_descPackage.COURSE_INSTANCE__YEAR:
				return year != YEAR_EDEFAULT;
			case Course_descPackage.COURSE_INSTANCE__LECTURE_HOURS:
				return lectureHours != LECTURE_HOURS_EDEFAULT;
			case Course_descPackage.COURSE_INSTANCE__LAB_HOURS:
				return labHours != LAB_HOURS_EDEFAULT;
			case Course_descPackage.COURSE_INSTANCE__IS_INSTANCE_OF:
				return getIsInstanceOf() != null;
			case Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE:
				return hasPersonRole != null && !hasPersonRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Year: ");
		result.append(year);
		result.append(", LectureHours: ");
		result.append(lectureHours);
		result.append(", LabHours: ");
		result.append(labHours);
		result.append(')');
		return result.toString();
	}

} //CourseInstanceImpl
