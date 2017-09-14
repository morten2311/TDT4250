/**
 */
package course_desc.impl;

import course_desc.Course_descPackage;
import course_desc.Exam;

import course_desc.Student;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.ExamImpl#getDate <em>Date</em>}</li>
 *   <li>{@link course_desc.impl.ExamImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link course_desc.impl.ExamImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link course_desc.impl.ExamImpl#getHasRegisteredStudents <em>Has Registered Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamImpl extends EvaluationImpl implements Exam {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected String place = PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRegisteredStudents() <em>Has Registered Students</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRegisteredStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> hasRegisteredStudents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.EXAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.EXAM__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(String newPlace) {
		String oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.EXAM__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.EXAM__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getHasRegisteredStudents() {
		if (hasRegisteredStudents == null) {
			hasRegisteredStudents = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS, Course_descPackage.STUDENT__HAS_EXAMS);
		}
		return hasRegisteredStudents;
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
			case Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasRegisteredStudents()).basicAdd(otherEnd, msgs);
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
			case Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS:
				return ((InternalEList<?>)getHasRegisteredStudents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.EXAM__DATE:
				return getDate();
			case Course_descPackage.EXAM__PLACE:
				return getPlace();
			case Course_descPackage.EXAM__DURATION:
				return getDuration();
			case Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS:
				return getHasRegisteredStudents();
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
			case Course_descPackage.EXAM__DATE:
				setDate((Date)newValue);
				return;
			case Course_descPackage.EXAM__PLACE:
				setPlace((String)newValue);
				return;
			case Course_descPackage.EXAM__DURATION:
				setDuration((Double)newValue);
				return;
			case Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS:
				getHasRegisteredStudents().clear();
				getHasRegisteredStudents().addAll((Collection<? extends Student>)newValue);
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
			case Course_descPackage.EXAM__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case Course_descPackage.EXAM__PLACE:
				setPlace(PLACE_EDEFAULT);
				return;
			case Course_descPackage.EXAM__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS:
				getHasRegisteredStudents().clear();
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
			case Course_descPackage.EXAM__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case Course_descPackage.EXAM__PLACE:
				return PLACE_EDEFAULT == null ? place != null : !PLACE_EDEFAULT.equals(place);
			case Course_descPackage.EXAM__DURATION:
				return duration != DURATION_EDEFAULT;
			case Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS:
				return hasRegisteredStudents != null && !hasRegisteredStudents.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(", place: ");
		result.append(place);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ExamImpl
